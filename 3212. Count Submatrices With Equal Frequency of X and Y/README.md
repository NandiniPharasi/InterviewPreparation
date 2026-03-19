We are given a 2D grid of characters – each cell is either 'X', 'Y', or '.'. Our task is to count submatrices that satisfy three conditions:

The submatrix must include the top‑left cell grid[0][0] (so its top‑left corner is fixed at (0,0), only the bottom‑right corner varies).
It must contain at least one 'X'.
The number of 'X' and 'Y' inside the submatrix must be equal.
We need to return the total number of such submatrices.

Key Insight: Instead of enumerating all possible rectangles and counting X and Y inside each one from scratch (which would be O(n⁴) or worse), we can use prefix sums to compute the counts for any rectangle that starts at (0,0) in O(1) time after a single preprocessing pass.

we only care about the difference between X and Y counts, we can keep a single 2D array diff that stores (#X - #Y) for the rectangle from (0,0) to each cell (i,j). Then, checking condition 3 becomes diff[i][j] == 0. And we also need to know whether that rectangle contains at least one X – we track that separately in a boolean array has_x.

EXAMPLES OF WORK
💠 Example 1:
grid = [["X","Y","."],
        ["Y",".","."]]
Submatrices starting at (0,0):

Up to (0,0): X=1, Y=0 → diff=1, has_x=true → no
Up to (0,1): X=1, Y=1 → diff=0, has_x=true → yes
Up to (0,2): X=1, Y=1 → diff=0, has_x=true → yes
Up to (1,0): X=1, Y=1 → diff=0, has_x=true → yes
Up to (1,1): X=1, Y=2 → diff=-1, has_x=true → no
Up to (1,2): X=1, Y=2 → diff=-1, has_x=true → no
Count = 3 (matches output).

💠 Example 2:
grid = [["X","X"],
        ["X","Y"]]
Up to (0,0): diff=1 → no
Up to (0,1): diff=2 → no
Up to (1,0): diff=2 → no
Up to (1,1): diff=2 → no (X=3, Y=1 → diff=2)
Output = 0.
LINE-BY-LINE EXPLANATION OF THE CODE
STEP 1: INITIALIZING THE PREFIX ARRAYS
public int numberOfSubmatrices(char[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    
    int[][] diff = new int[m+1][n+1];          // → diff[i][j] = (#X - #Y) in submatrix (0,0) to (i-1,j-1)
    boolean[][] has_x = new boolean[m+1][n+1]; // → does that submatrix contain at least one X?
    
    int count = 0;
What's happening here:

We get the dimensions m (rows) and n (cols) of the grid.
diff is an (m+1) x (n+1) integer array. We use the extra row and column (index 0) to avoid boundary checks when calculating prefix sums.
diff[i][j] will store the value for the rectangle from (0,0) to (i-1, j-1) in the original grid.
has_x is a boolean array of the same size, telling us if that rectangle contains any 'X'.
count will accumulate the number of valid submatrices.
Why +1? This is a classic prefix‑sum trick: we leave row 0 and col 0 filled with zeros (or false), so the formulas for diff[i][j] work uniformly even when i=1 or j=1. The actual grid cells correspond to indices i-1, j-1.

STEP 2: LOOPING OVER ALL POSSIBLE BOTTOM‑RIGHT CORNERS
    for (int i = 1; i <= m; i++) {  
        for (int j = 1; j <= n; j++) { 
What's happening here:

We iterate over every cell (i-1, j-1) of the original grid.
The nested loops go from 1 to m and 1 to n because our prefix arrays are 1‑based.
For each (i, j), we are going to compute the prefix information for the rectangle that ends at (i-1, j-1).
STEP 3: DETERMINING THE CONTRIBUTION OF THE CURRENT CELL
            int val = 0;
            if (grid[i-1][j-1] == 'X') {
                val = 1;
            } else if (grid[i-1][j-1] == 'Y') {
                val = -1;
            }
What's happening here:

We look at the current grid cell (i-1, j-1).
If it's 'X', we set val = 1 (adds one to the X‑Y difference).
If it's 'Y', we set val = -1 (subtracts one, because Y reduces the difference).
If it's '.', val = 0 (no effect on the difference).
This val is the contribution of this single cell to the overall diff of the rectangle that ends here.

STEP 4: UPDATING THE DIFFERENCE PREFIX SUM
            diff[i][j] = diff[i-1][j] + diff[i][j-1] - diff[i-1][j-1] + val;
What's happening here:

This is the standard 2D prefix sum formula.
diff[i-1][j] covers the rectangle above the current row,
diff[i][j-1] covers the rectangle left of the current column,
they double‑count the top‑left rectangle diff[i-1][j-1], so we subtract it once.
Then we add the contribution val of the current cell.
The result is the exact (#X - #Y) for the rectangle from (0,0) to (i-1, j-1).
Why we need this: With this array built, we can later check equality of X and Y simply by seeing if diff[i][j] == 0.

STEP 5: UPDATING THE “HAS X” INFORMATION
            has_x[i][j] = has_x[i-1][j] || has_x[i][j-1] 
                       || has_x[i-1][j-1] || (grid[i-1][j-1] == 'X');
What's happening here:

We want to know if the rectangle that ends at (i-1, j-1) contains any 'X'.
This is true if:
The rectangle above (has_x[i-1][j]) contains an X, or
The rectangle to the left (has_x[i][j-1]) contains an X, or
The rectangle diagonally above‑left (has_x[i-1][j-1]) contains an X (though note that this is actually covered by the first two – but we keep it for clarity), or
The current cell itself is an 'X'.
Using || with booleans ensures that once any part of the rectangle has an X, the whole rectangle is marked as containing one.
Why separate arrays? We could derive this from diff alone (e.g., by checking if there is any X in the rectangle), but that would require additional data.

STEP 6: CHECKING THE CONDITIONS AND COUNTING
            if (has_x[i][j] && diff[i][j] == 0) count++;
What's happening here:

For the rectangle ending at (i-1, j-1), we now know:

has_x[i][j] tells us if there is at least one X.
diff[i][j] tells us if the numbers of X and Y are equal (diff == 0).
If both are true, we increment the counter. This rectangle is valid.

