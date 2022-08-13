package LeetCode.dynamicProgramming;

public class JumpGame2 {

    public static void main(String[] args) {
        int arr[]=new int[]{2,3,0,1,4};
        System.out.println(jumpTab(arr));
    }

    public static int jumpTab(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length;
        //declaration dp array
        int tab[]=new int[nums.length];
        //initialization
        tab[tab.length-1]=0;

        for(int i=tab.length-2;i>=0;i--){
            int maxDist=nums[i];

            int min=Integer.MAX_VALUE;
            for(int j=1;(j<=maxDist) && (i+j)<nums.length;j++){
                if(tab[i+j]!=Integer.MAX_VALUE){
                    min=Math.min(min,1+tab[i+j]);
                }
            }
            tab[i]=min;
        }



        return tab[0];
    }

    public static int jump(int[] nums,int ind) {
        //base case
        if(ind==nums.length-1) return 0;
        if(ind>nums.length-1) return -1;

        int maxJump=nums[ind];
        int minDist=Integer.MAX_VALUE;
        for (int i = 1; i <=maxJump ; i++) {
            int temp=jump(nums,ind+i);
            System.out.println(
                    "h"+temp
            );
            if(temp!=-1){
                minDist=Math.min(minDist,1+temp);
            }
        }

        if(minDist==Integer.MAX_VALUE) return -1;
        return minDist;
    }
}
