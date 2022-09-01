package loveBabbarSheet.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
//not solved
//https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1
public class MergeKSortedArrays {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(mergeKArrays2(arr,arr.length).toString());
    }

    public static ArrayList<Integer> mergeKArrays2(int[][] arr, int K)
    {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        ArrayList<Integer> res=new ArrayList<>();

            for (int j = 0; j <K ; j++) {
                for (int i = 0; i < K; i++) {
                    minHeap.add(arr[i][j]);

                    if(minHeap.size()>K){
                        res.add(minHeap.poll());
                    }
                }
        }



        return res;


    }

    //brute force approach
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                minHeap.add(arr[i][j]);
            }
        }


        ArrayList<Integer> res=new ArrayList<>();
        while (minHeap.isEmpty()){
            res.add(minHeap.poll());
        }

        return res;


    }
}
