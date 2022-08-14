package LeetCode.dynamicProgramming;
//https://leetcode.com/problems/maximum-subarray/submissions/
public class maximumSubArray {
    public static void main(String[] args) {
        int nums[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArrayOptimized(nums));
    }

    public static int maxSubArrayOptimized(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];


        int prev=nums[0];
        int max=prev;

        for (int i = 2; i <= nums.length ; i++) {
            int current=Math.max(
                    nums[i-1],
                    nums[i-1]+prev
            );

            max=Math.max(current,max);

            prev=current;
        }

        return max;
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        int tab[]=new int[nums.length+1];

        tab[0]=0;
        tab[1]=nums[0];
        int max=tab[1];

        for (int i = 2; i < tab.length ; i++) {
            tab[i]=Math.max(
                    nums[i-1],
                    nums[i-1]+tab[i-1]
            );

            max=Math.max(tab[i],max);
        }

        return max;
    }
}
