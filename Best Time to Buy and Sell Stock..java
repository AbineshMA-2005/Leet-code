class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        int k =prices.length;
        for(int i=1;i<k;i++)
        {
            min=Math.min(min,prices[i]);
            int c=prices[i]-min;
            max=Math.max(max,c);
        }
        return max;
    }
}
