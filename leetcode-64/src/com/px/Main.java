class Solution {
    public int minPathSum(int[][] grid) {

        int row = grid.length;
        int clown = grid[0].length;
        
        int[][] path = new int[row][clown];
        path[0][0] = grid[0][0];
        
        int sum = 0;
        for(int i=0;i<clown; i++){
            sum += grid[0][i];
            path[0][i] = sum;
        }
        sum = 0;
        for(int i=0;i<row; i++){
            sum += grid[i][0];
            path[i][0] = sum;
        }
        if(row == 1){
            return path[0][clown-1];
        }else if(clown == 1){
            return path[row-1][0];
        }
        
        int i=1;
        int j=1;
        for(;i<row;i++){
            j=1;
            for(;j<clown;j++){
                path[i][j] = Math.min(path[i-1][j], path[i][j-1])+grid[i][j];
            }
        }            
        return path[row-1][clown-1];       
    }
}
