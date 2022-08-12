package LeetCode.dynamicProgramming;

public class climbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {
        //base case
        if(n==0) return 1;

        //
        int res=0;
        if(n>=1) res+=climbStairs(n-1);
        if(n>=2) res+=climbStairs(n-2);

        return res;

    }

    public static int climbStairsTab(int n) {
        //base case
        if(n==0 || n==1 || n==2) return n;

        int x=1;
        int y=2;

        for(int i=3;i<=n;i++){
            int newY=x+y;
            x=y;
            y=newY;
        }

        return y;

    }
}
