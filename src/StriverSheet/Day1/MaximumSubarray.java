package StriverSheet.Day1;
//https://leetcode.com/problems/maximum-subarray/submissions/
public class MaximumSubarray {

    public static void main(String[] args) {
        int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static   int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int ansSum=nums[0];
        int curSum=nums[0];

        for (int i = 1; i < nums.length; i++) {
            curSum=Math.max(nums[i],curSum+nums[i]);
            ansSum=Math.max(ansSum,curSum);
        }



        return ansSum;

    }

}
