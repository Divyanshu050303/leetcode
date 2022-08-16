class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row, -1); 
        return countWay(m-1, n-1, dp);
    }
      static int countWay(int i, int j, int [][]dpArray){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dpArray[i][j]!=-1){
            return dpArray[i][j];
        }
        int up=countWay(i-1, j, dpArray);
        int left=countWay(i, j-1, dpArray);
        return dpArray[i][j]=up+left;
    }
    
}