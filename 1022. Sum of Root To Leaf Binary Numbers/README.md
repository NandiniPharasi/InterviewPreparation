Key Idea
When moving down the tree:

If current number = curr
Next node value = bit

We update:

curr = curr * 2 + bit
Because:

Appending a binary digit = multiply by 2 and add the digit.

Example:

Binary: 10 (2 in decimal)
Add 1 → 101

2 * 2 + 1 = 5
That’s exactly what we do while going down the tree.

Approach
We use DFS (Depth First Search).

At each node:

Update current number.
If it is a leaf → return current number.
Otherwise → return left sum + right sum.
Why DFS?
Because we need to explore every root → leaf path.

"Naruto: So we go deep till the end of one path first? 🌪️"
"Kakashi: Exactly. One full path. Then the next."

Step-by-Step Flow
Suppose tree is:

        1
      /   \
     0     1
    / \   / \
   0   1 0   1
Paths:

100 → 4
101 → 5
110 → 6
111 → 7
Sum:

4 + 5 + 6 + 7 = 22
