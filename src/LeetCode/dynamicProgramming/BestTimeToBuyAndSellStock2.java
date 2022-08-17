package LeetCode.dynamicProgramming;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int arr[]=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {


        int j=0;
        boolean isBuying=true;
        int maxProfit=0;
        int buyPrice=0;

        while(j<prices.length){
            if(isBuying){
                if(j!=prices.length-1 && prices[j]<prices[j+1]){
                    buyPrice=prices[j];
                    isBuying=!isBuying;
                }
                j++;
            }else{
                maxProfit+=prices[j]-buyPrice;
                isBuying=!isBuying;
            }




        }

        return maxProfit;

    }
}
