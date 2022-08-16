package LeetCode.dynamicProgramming;

import java.util.Arrays;

public class maximumProductSubArray {
    public static void main(String[] args) {
        int nums[]=new int[]{2,3,-2,4};
        System.out.println(maxProductArray(nums));
    }

    public static int maxProductArray(int[] nums) {
       //find max in an array
        int res=Integer.MIN_VALUE;
        for(int el : nums)
            res=Math.max(res,el);

        int curMin=1;
        int curMax=1;

        for(int el : nums){
            if(el==0){
                curMax=1;curMin=1;
                continue;
            }


            int temp=curMax*el;
            curMax=Math.max(Math.max(el*curMax,el*curMin),el);
            curMin=Math.min(Math.min(temp,el*curMin),el);
            res=Math.max(res,curMax);
        }

        return res;
    }


}
