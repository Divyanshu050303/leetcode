class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int [][]dpArray=new int [m][n];
        for(int []row:dpArray)
            Arrays.fill(row, -1);
        return obstacal(m-1, n-1, obstacleGrid, dpArray);
        
    }
    public int obstacal(int i, int j, int [][]array, int [][]dpArray){
        if(i>=0 && j>=0 &&array[i][j]==1)
            return 0;
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        if(dpArray[i][j]!=-1)
            return dpArray[i][j];
        int up=obstacal(i-1, j, array, dpArray);
        int left=obstacal(i, j-1, array, dpArray);
        return dpArray[i][j]=up+left;
        
    }
}