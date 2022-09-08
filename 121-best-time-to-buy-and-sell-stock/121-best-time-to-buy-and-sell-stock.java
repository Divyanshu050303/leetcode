class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minpr=Integer.MAX_VALUE;
        int maxpr=0;
        for(int i=0;i<n;i++){
            if(prices[i]<minpr){
                minpr=prices[i];
            }
            maxpr=Math.max(prices[i]-minpr, maxpr);
        }
        return maxpr;
    }
}