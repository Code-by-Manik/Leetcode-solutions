class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;
        int maxP = 0;
        for(int i:prices){
            if(i<mini) mini = i;
            profit = i - mini;

            if(profit > maxP) maxP = profit;

        }
        return maxP;
        
    }
}
