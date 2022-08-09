package Algoexpert.DynamicProgramming;

import java.util.Arrays;

public class MaxSubsetSumNoAdjacent {
    public static void main(String[] args) {

        int arr[]=new int[]{75,105,120,75,90,135};
        System.out.println(solveTab(arr));
    }

    static int solveRec(int arr[],int ind){
        //base case
        int size=arr.length;
        if(ind>=size) return 0;

        //two cases
        int takeIt=arr[ind] + solveRec(arr,ind+2);
        int dontTakeIt=solveRec(arr,ind+1);

        return Math.max(takeIt,dontTakeIt);
    }

    static int solveTab(int arr[]){
        int size=arr.length;
        if(size==0) return 0;
        //declaration
        int tab[]=new int [size+1];

        //initialization
        tab[0]=0;
        tab[1]=arr[0];

        for (int i = 2; i <=size ; i++) {
            int takeIt= arr[i-1] + tab[i-2];
            int dontTakeIt = tab[i-1];

            tab[i]=Math.max(takeIt,dontTakeIt);
        }



        return tab[arr.length];
    }
}
