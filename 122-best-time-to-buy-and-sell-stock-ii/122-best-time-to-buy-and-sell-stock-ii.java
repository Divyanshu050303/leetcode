class Solution {
    public int maxProfit(int[] prices) {
         int profit=0;
        //strt with index1 and compare the price
        // with previous day price and calculatir profit if any
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
        
    }
}