package StriverSheet.Day1;

public class MaxSubArray {
    public static int maxProfit(int[] prices) {
        int curMin=prices[0];
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            maxProfit=Math.max(maxProfit,prices[i]-curMin);
            curMin=Math.min(curMin,prices[i]);
        }

        return maxProfit;
    }
}
