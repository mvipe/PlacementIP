package Algoexpert.DynamicProgramming;

public class minNoOfJumps {
    public static void main(String[] args) {
//
      //  int arr[]=new int []{3,4,2,1,2,3,7,11,3};
        int arr[]=new int []{1};
        System.out.println(minNumberOfJumps(arr,0));
    }

    //recursion
    public static int minNumberOfJumps(int[] array,int ind) {
        //base case
        if(ind>=array.length-1) return 0;
        //
        int min=Integer.MAX_VALUE;
        for (int i = 1; i <= array[ind]; i++) {
            int res=1+minNumberOfJumps(array,ind+i);
            min=Math.min(min,res);
        }


        return min;
    }

}
