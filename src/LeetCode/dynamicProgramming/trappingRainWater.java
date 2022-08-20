package LeetCode.dynamicProgramming;

public class trappingRainWater {
    public static void main(String[] args) {
int arr[]=new int[]{4,2,0,3,2,5};
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
       int n=height.length;

       int ngl[]=new int[n];
       int ngr[]=new int[n];

        ngl[0]=height[0];
        for (int i = 1; i <ngl.length ; i++) {
            ngl[i]=Math.max(ngl[i-1],height[i]);
        }

        ngr[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            ngr[i]=Math.max(ngr[i+1],height[i]);
        }

        //calculate max water trapped
        int maxWater=0;
        for (int i = 0; i <n ; i++) {
            maxWater+=Math.min(ngl[i],ngr[i])-height[i];
        }

        return maxWater;
    }
}
