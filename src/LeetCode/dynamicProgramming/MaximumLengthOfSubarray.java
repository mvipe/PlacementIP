package LeetCode.dynamicProgramming;
//https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/
public class MaximumLengthOfSubarray {
    //Maximum Length of Subarray With Positive Product

    public static void main(String[] args) {
        int nums[]=new int[]{0,1,-2,-3,-4};
        System.out.println(getMaxLen(nums));
    }
    public static int getMaxLen(int[] nums) {

        int res=0;
        int maxNegativeLength=0;//this represent current max negastive subarray length
        int maxPositiveLength=0;//this represent current max positive subarray length

        for(int el:nums){
            if(el==0){
                maxNegativeLength=0;
                maxPositiveLength=0;
            }
            else if(el<0){
                int tempPrevNeg=maxNegativeLength;
                maxNegativeLength=maxPositiveLength+1;
                if(tempPrevNeg!=0){
                    maxPositiveLength=tempPrevNeg+1;
                }else{
                    maxPositiveLength=0;
                }
            }else{
                //el>0
                maxPositiveLength=maxPositiveLength+1;
                if(maxNegativeLength!=0){
                    maxNegativeLength=maxNegativeLength+1;
                }
            }

            res=Math.max(res,maxPositiveLength);

        }

        return res;
    }
}
