class Solution {
    public int change(int amount, int[] coins) {
        int max=amount+1;
        int []dp=new int[max];
        dp[0]=1;
        for(int j:coins){
            for(int i=j;i<max;i++){
                dp[i]+=dp[i-j];
            }
        }
        return dp[amount];
    }
}