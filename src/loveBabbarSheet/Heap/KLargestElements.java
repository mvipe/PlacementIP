package loveBabbarSheet.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;
//https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1
public class KLargestElements {
    public static void main(String[] args) {
        int arr[]=new int[]{12, 5, 787, 1, 23};
        System.out.println(Arrays.toString(kLargest(arr,arr.length,2)));
    }

    static int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for (int el : arr){
            minHeap.add(el);
            if(minHeap.size()>k) minHeap.poll();
        }

        int res[]=new int[k];
        int i=res.length-1;
        while (!minHeap.isEmpty()){
            res[i]=minHeap.poll();
            i--;
        }

        return res;
    }
}
