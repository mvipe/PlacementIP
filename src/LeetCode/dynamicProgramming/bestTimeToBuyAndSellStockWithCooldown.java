package LeetCode.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class bestTimeToBuyAndSellStockWithCooldown {
    public static void main(String[] args) {
int arr[]=new int[]{2,1,4};

    }

    public int maxProfitTab(int[] prices) {
        int tab[][]=new int[prices.length+2][2];
        Arrays.fill(tab[0],0);
        Arrays.fill(tab[1],0);

        for(int i=prices.length-1;i>=0;i--){
            tab[i][1]=Math.max(-prices[i]+tab[i+1][0],
                    0+tab[i+1][1]);

            tab[i][0]=Math.max(prices[i]+tab[i+2][0],
                    0+tab[i+1][0]);
        }

        return tab[0][1];
    }

    public static int maxProfit(int[] prices) {
        int mem[][]=new int[2][prices.length+1];
        Arrays.fill(mem[0],-1);
        Arrays.fill(mem[1],-1);
        return maxProfit(prices,0,1,mem);
    }

    public static int maxProfit(int[] prices,int ind,int buy,int mem[][]) {
        //1 for buy 0 for sell
        if(prices.length<=ind)return 0;
        if(mem[buy][ind]!=-1) return mem[buy][ind];

        if(buy==1){
            mem[buy][ind]= Math.max(
                    -prices[ind]+maxProfit(prices,ind+1,0,mem),
                    maxProfit(prices,ind+1,1,mem)
            );

            return mem[buy][ind];
        }
        else{
            mem[buy][ind]= Math.max(
                    prices[ind]+maxProfit(prices,ind+2,1,mem),
                    maxProfit(prices,ind+1,0,mem)
            );

            return mem[buy][ind];
        }


    }
}
