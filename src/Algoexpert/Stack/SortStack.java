package Algoexpert.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-5);
        list.add(2);
        list.add(-2);
        list.add(4);
        list.add(3);
        list.add(1);

        System.out.println(sortStack(list).toString());
    }


    public static ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
        // Write your code here.
        Stack<Integer> stackk=new Stack<>();
        for (int i = 0; i < stack.size(); i++) {
            stackk.push(stack.get(i));
        }

        sort(stackk);


        for (int i = 0; i < stack.size(); i++) {
            stack.set(i,stackk.pop());
        }


        return stack;
    }

    public static void sort(Stack<Integer> stack){
        //base case
        if(stack.isEmpty() || stack.size()==1){
            return;
        }

        //hypothesis
        int popEl=stack.pop();
        sort(stack);

        //induction
        insert(stack,popEl);
    }

    private static void insert(Stack<Integer> stack, int popEl) {
        //base case
        if(stack.isEmpty() || stack.peek()>=popEl){
            stack.push(popEl);
            return;
        }

        //hypothesis
        int removedEl=stack.pop();
        insert(stack,popEl);

        //induction
        stack.push(removedEl);



    }



}
