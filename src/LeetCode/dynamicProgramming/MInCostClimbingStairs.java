package LeetCode.dynamicProgramming;

public class MInCostClimbingStairs {
    public static void main(String[] args) {
        int arr[]=new int[]{1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {
        if(cost.length==0 || cost.length==1) return 0;

        int prev1=0;
        int prev2=0;

        for(int i=2;i<=cost.length;i++){
            int newPrev1=Math.min(
                    cost[i-2] + prev1,
                    cost[i-1] + prev2
            );

            prev1=prev2;
            prev2=newPrev1;
        }

        return prev2;

    }

}

