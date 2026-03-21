class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int startRow=x;
        int endrow=x+k-1;
        int startCol=y;
        int endcol=y+k-1;

        for(int i=startRow;i<=endrow; i++){
            for(int j= startCol; j<=endcol; j++){
                int temp=grid[i][j];
                grid[i][j] = grid[endrow][j];
                grid[endrow][j]=temp;
               
            }
             endrow--;
        }
        return grid;
        
    }
}
