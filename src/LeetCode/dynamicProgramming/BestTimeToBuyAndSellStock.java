package LeetCode.dynamicProgramming;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
int arr[]=new int[]{7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {


        int j=1;
        int minBuyPrice=prices[0];
        int maxProfit=0;

        while(j<prices.length){
            maxProfit=Math.max(maxProfit,prices[j]-minBuyPrice);
            minBuyPrice=Math.min(minBuyPrice,prices[j]);
            j++;
        }

        return maxProfit;

    }
}
