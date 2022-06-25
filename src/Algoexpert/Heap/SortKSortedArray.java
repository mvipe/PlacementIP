package Algoexpert.Heap;

import java.util.PriorityQueue;

public class SortKSortedArray {
}

class Program {

    public int[] sortKSortedArray(int[] arr, int k) {
        // Write your code here.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int curInd=0;

        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);

            if(minHeap.size()>k){

                arr[curInd]=minHeap.poll();
                curInd++;
            }
        }

        while(!minHeap.isEmpty()){
            arr[curInd]=minHeap.poll();
            curInd++;
        }

        return arr;
    }
}

