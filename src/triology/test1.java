package triology;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int arr[]=new int[]{47,41,49,39,41,43,36,14,15,12,50,22,14,3};
       // int arr[]=new int[]{49,41,2,14,13,44,47,37,34};
        System.out.println(solve2(arr.length,arr));
    }

    static long solve2(int A,int B[]){
        if(B.length==0) return 0;
        Arrays.sort(B);
        System.out.println(Arrays.toString(B));
        long max=B[0]*A;

        for (int i = 1; i <B.length ; i++) {
            max=Math.max(max,B[i]*(B.length-i));
        }

        return max;
    }

    static int solve(int arr[]){
      if(arr.length==0) return 0;
        Arrays.sort(arr);
        int max=Integer.MIN_VALUE;
        int curMin;
        for(int i=0;i<arr.length;i++){
            curMin=arr[i];
            for(int j=i;j<arr.length;j++){
                curMin=Math.min(curMin,arr[j]);
                max=Math.max(max,curMin*(j-i+1));
            }
        }

        return max;
    }
}
