package LeetCode.dynamicProgramming;

import java.util.Arrays;

public class ArithmeticSlices {
    public static void main(String[] args) {

    }

    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int res=0;
        int n=nums.length;

        int tab[]=new int[n];
        Arrays.fill(tab,0);
        for (int i = 2; i < n; i++) {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                tab[i]=1+tab[i-1];
                res+=tab[i];
            }
        }

        return res;

    }
}
