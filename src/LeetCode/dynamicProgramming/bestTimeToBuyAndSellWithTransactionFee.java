package LeetCode.dynamicProgramming;

import java.util.Arrays;

public class bestTimeToBuyAndSellWithTransactionFee {
    public static void main(String[] args) {
        int arr[]=new int[]{1,3,2,8,4,9};
        System.out.println(maxProfit(arr,2));
    }

    public static int maxProfit(int[] prices,int fee) {
        int mem[][]=new int[2][prices.length+1];
        Arrays.fill(mem[0],-1);
        Arrays.fill(mem[1],-1);
        return maxProfit(prices,0,1,mem,fee);
    }

    public static int maxProfit(int[] prices,int ind,int buy,int mem[][],int fee) {
        //1 for buy 0 for sell
        if(prices.length<=ind)return 0;
        if(mem[buy][ind]!=-1) return mem[buy][ind];

            if(buy==1){
                mem[buy][ind]= Math.max(
                        -prices[ind]+maxProfit(prices,ind+1,0,mem,fee),
                        maxProfit(prices,ind+1,1,mem,fee)
                );

                return mem[buy][ind];
            }
            else{
                mem[buy][ind]= Math.max(
                        prices[ind]-fee+maxProfit(prices,ind+1,1,mem,fee),
                        maxProfit(prices,ind+1,0,mem,fee)
                );

                return mem[buy][ind];
            }


    }
}
