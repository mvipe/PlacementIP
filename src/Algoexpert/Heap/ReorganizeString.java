package Algoexpert.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
//https://leetcode.com/problems/reorganize-string/submissions/
public class ReorganizeString {
    public static void main(String[] args) {

    }

    public class Pair{
        char ch;
        int val;

        public Pair(char ch,int val){
            this.ch=ch;
            this.val=val;
        }
    }

    public static String reorganizeString(String s) {

        Map<Character,Integer> counts=new HashMap<>();
        for (char c:s.toCharArray()){
            counts.put(c,counts.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->counts.get(b)-counts.get(a));
        maxHeap.addAll(counts.keySet());

        StringBuilder res=new StringBuilder();
        while (maxHeap.size()>1){
            //two different most frequent character
            Character curent=maxHeap.remove();
            Character next=maxHeap.remove();

            res.append(curent);
            res.append(next);


            counts.put(curent,counts.get(curent)-1);
            counts.put(next,counts.get(next)-1);

            if(counts.get(curent)>0){
                maxHeap.add(curent);
            }
            if(counts.get(next)>0){
                maxHeap.add(next);
            }
        }

        if(!maxHeap.isEmpty()){
            char last=maxHeap.remove();
            if(counts.get(last)>1){
                return "";
            }
            res.append(last);
        }

        return res.toString();



    }
}
