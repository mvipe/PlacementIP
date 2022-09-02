package loveBabbarSheet.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
//not solved
//https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1
public class MergeKSortedArrays {
    public static void main(String[] args) {
        int arr[][]={{1,2,8},{4,5,6},{7,8,9}};
        System.out.println(mergeKArrays2(arr,arr.length).toString());
    }

    public static ArrayList<Integer> mergeKArrays2(int[][] arr, int K)
    {
        PriorityQueue<Element> minHeap=new PriorityQueue<>();
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<K;i++){
            minHeap.add(new Element(arr[i][0],i,0));
        }

        while (!minHeap.isEmpty()){
            Element rm=minHeap.poll();
            res.add(rm.val);

            if(rm.j<K-1){
                minHeap.add(new Element(arr[rm.i][rm.j+1],rm.i,rm.j+1));
            }
        }



        return res;


    }

    static class Element implements Comparable<Element>{
        int val;
        int i;
        int j;

        public Element(int val,int i,int j){
            this.val=val;
            this.i=i;
            this.j=j;
        }

        @Override
        public int compareTo(Element o) {
            if(this.val==o.val) return 0;
            else if(this.val>o.val) return 1;
            else return -1;
        }
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
