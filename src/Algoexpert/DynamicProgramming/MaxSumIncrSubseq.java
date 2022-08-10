package Algoexpert.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class MaxSumIncrSubseq {
    public static void main(String[] args) {
//        int arr[]=new int[]{10,70,20,30,50,11,30};
        int arr[]=new int[]{5,4,3,2,1};
        List<List<Integer>> res=maxSumIncreasingSubsequence(arr,0,Integer.MIN_VALUE);
        System.out.println(res.get(0).toString());
        System.out.println(res.get(1).toString());
    }

    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] arr,int ind,int thershold) {

        if(ind==arr.length) {
            List<List<Integer>> list=new ArrayList<>();
            List<Integer> sum=new ArrayList<>();
            sum.add(Integer.MIN_VALUE);
            list.add(sum);
            list.add((new ArrayList<>()));
            return list;
        }

        //
        if(arr[ind]>thershold){
            List<List<Integer>> takeIt=maxSumIncreasingSubsequence(arr,ind+1,arr[ind]);
            List<List<Integer>> dontTakeIt=maxSumIncreasingSubsequence(arr,ind+1,thershold);

            if(arr[ind]+takeIt.get(0).get(0)>dontTakeIt.get(0).get(0)){
                if(takeIt.get(0).get(0)==Integer.MIN_VALUE){
                    takeIt.get(0).set(0,arr[ind]);
                    takeIt.get(1).add(0,arr[ind]);
                    return takeIt;
                }
                int newSum=arr[ind]+takeIt.get(0).get(0);
                takeIt.get(0).set(0,newSum);
                takeIt.get(1).add(0,arr[ind]);


                return takeIt;
            }else{
                // if(dontTakeIt.get(0).get(0)==Integer.MIN_VALUE){
                //       dontTakeIt.get(0).set(0,arr[ind]);
                //       dontTakeIt.get(1).add(0,arr[ind]);
                //     return takeIt;
                //   }
                return dontTakeIt;
            }

        }
        else {
            List<List<Integer>> dontTakeIt=maxSumIncreasingSubsequence(arr,ind+1,thershold);
            return dontTakeIt;
        }


    }


    static int solveMemo(int arr[],int ind,int thershold,int mem[]){
        //base case
        if(ind==arr.length-1) return 0;

        //
        if(arr[ind]>thershold){
            return Math.max(
                    arr[ind]+solveRec(arr,ind+1,arr[ind]),
                    solveRec(arr,ind+1,thershold)
            );
        }

        else return solveRec(arr,ind+1,thershold);
    }

    static int solveRec(int arr[],int ind,int thershold){
        //base case
        if(ind==arr.length-1) return 0;

        //
        if(arr[ind]>thershold){
            return Math.max(
                    arr[ind]+solveRec(arr,ind+1,arr[ind]),
                    solveRec(arr,ind+1,thershold)
            );
        }

        else return solveRec(arr,ind+1,thershold);
    }
}
