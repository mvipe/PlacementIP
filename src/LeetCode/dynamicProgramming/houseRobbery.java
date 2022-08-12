package LeetCode.dynamicProgramming;
//https://leetcode.com/problems/house-robber/
public class houseRobbery {

    public static void main(String[] args) {
        int arr[]=new int[]{2,7,9,3,1};
        System.out.println(robTab(arr,0));
    }

    //recursion
    public static int rob(int[] nums,int ind) {
        if(ind>=nums.length) return 0;


        //
        return Math.max(
                nums[ind] + rob(nums,ind+2),
                rob(nums,ind+1)
        );
    }

    //dp
    public static int robTab(int[] nums,int ind) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);


        //
        int a=nums[0];
        int b=Math.max(nums[0],nums[1]);

        for (int i = 2; i <nums.length ; i++) {
            int newB=Math.max(nums[i]+a,b);
            a=b;
            b=newB;
        }

        return b;
    }
}
