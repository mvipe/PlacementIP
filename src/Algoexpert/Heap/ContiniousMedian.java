package Algoexpert.Heap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

//https://www.algoexpert.io/questions/continuous-median

public class ContiniousMedian {
    public static void main(String[] args) {
        Program.ContinuousMedianHandler program= new Program.ContinuousMedianHandler();
        program.insert(5);
        System.out.println(program.median);
        program.insert(10);
        System.out.println(program.median);
        program.insert(100);
        System.out.println(program.median);
        program.insert(200);
        System.out.println(program.median);
        program.insert(6);
        System.out.println(program.median);
        program.insert(13);
        System.out.println(program.median);
        program.insert(14);
        System.out.println(program.median);





    }
    static class Program {
        static class ContinuousMedianHandler {
            PriorityQueue<Integer> lowerHalf=new PriorityQueue<>((a,b)->(b-a));
            PriorityQueue<Integer> greaterHalf=new PriorityQueue<>();

            double median = 0;

            public void insert(int number) {
                //add number first

                if(lowerHalf.size()==0 && greaterHalf.size()==0){
                    lowerHalf.add(number);
                    median=number;
                    return;
                }

                if(lowerHalf.peek()>number){
                    lowerHalf.add(number);
                }else{
                    greaterHalf.add(number);
                }

                //balance the heap
                if(Math.abs(lowerHalf.size()-greaterHalf.size())>1){
                    //balance is needed
                    //step-1 : remove el from greater length arr

                    if(lowerHalf.size()>greaterHalf.size()){
                        int rmVal=lowerHalf.remove();
                        greaterHalf.add(rmVal);
                    }else{
                        int rmVal=greaterHalf.remove();
                        lowerHalf.add(rmVal);
                    }
                }

                //calculate median
                if(lowerHalf.size()==greaterHalf.size()){
                    //means it is even
                    median=(lowerHalf.peek()+greaterHalf.peek())/(2.0);
                }else if(lowerHalf.size()>greaterHalf.size()){
                    //means it is even
                    median=lowerHalf.peek();
                }else{
                    median=greaterHalf.peek();
                }
            }

            public double getMedian() {
                return median;
            }
        }
    }


}

