class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] diff = new int[m+1][n+1];
        boolean[][] hasSeen = new boolean[m+1][n+1];

        int count = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int val = 0;

                if (grid[i-1][j-1] == 'X') {
                    val = 1;
                } else if (grid[i-1][j-1] == 'Y') {
                    val = -1;
                }
                //diff[i-1]j-1] area which was overlapping
                diff[i][j] = diff[i - 1][j] + diff[i][j-1]-diff[i-1][j-1] + val;
                hasSeen[i][j] = hasSeen[i-1][j] || hasSeen[i][j-1] || hasSeen[i-1][j-1]
                        || (grid[i - 1][j - 1] == 'X');

                if (hasSeen[i][j] && diff[i][j] == 0)
                    count++;
            }
        }
        return count;
    }
}
