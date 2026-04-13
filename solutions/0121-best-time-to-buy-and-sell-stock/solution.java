class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            int profit=prices[i+1]-buy;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
