package LeetCode.dynamicProgramming;
//https://leetcode.com/problems/house-robber/
public class houseRobbery2 {

    public static void main(String[] args) {
        int arr[]=new int[]{1,2};
        //System.out.println(rob(arr));
    }

    public  int rob(int[] nums) {
        if(nums.length==1 ) return nums[0];
        if(nums.length==0) return 0;
        int first=robTab(nums,0,nums.length-1);
        int last=robTab(nums,1,nums.length);

        return Math.max(
                first,last

        );
    }


    //dp
    public int robTab(int[] nums,int ind,int n) {
        if(n==0 || ind>=n) return 0;
        if(n-ind==1 ) return nums[ind];
        //if(n==2) return Math.max(nums[0],nums[1]);


        //
        int a=nums[ind];
        int b=Math.max(nums[ind],nums[ind+1]);
        int i = 2+ind;

        for (; i <n ; i++) {

            int newB=Math.max(nums[i]+a,b);
            a=b;
            b=newB;
        }

        return b;
    }
}
