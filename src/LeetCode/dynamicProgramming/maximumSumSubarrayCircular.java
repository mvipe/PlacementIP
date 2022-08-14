package LeetCode.dynamicProgramming;

import java.util.Arrays;

public class maximumSumSubarrayCircular {
    public static void main(String[] args) {
        int nums[]=new int[]{ 5,-3,5};
        System.out.println(maxSubarraySumCircular(nums));
    }



    public static int maxSubarraySumCircular(int[] nums) {
        int n= nums.length;
        int MAX_STRAIGHT_SUM=Integer.MIN_VALUE;
        int MIN_STRAIGHT_SUM=Integer.MAX_VALUE;

        int arraySum=0;
        int temp_maxSum=0;
        int temp_minSum=0;

        for (int i = 0; i < n; i++) {
            arraySum+=nums[i];

            temp_maxSum+=nums[i];
            MAX_STRAIGHT_SUM=Math.max(MAX_STRAIGHT_SUM,temp_maxSum);
            temp_maxSum=temp_maxSum<0 ?0:temp_maxSum;

            temp_minSum+=nums[i];
            MIN_STRAIGHT_SUM=Math.min(MIN_STRAIGHT_SUM,temp_minSum);
            temp_minSum=temp_minSum>0?0:temp_minSum;

        }

        if(arraySum==MIN_STRAIGHT_SUM){
            //means that all element in this array is negative
            return MAX_STRAIGHT_SUM;
        }

        return Math.max(MAX_STRAIGHT_SUM,(arraySum-MIN_STRAIGHT_SUM));
    }
}
