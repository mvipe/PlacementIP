package Algoexpert.Stack;

import java.util.ArrayList;

public class MinMaxStackHelper {
    public static void main(String[] args) {
        MinMaxStack stack=new MinMaxStack();
        stack.push(5);
        System.out.println("peek: " + stack.peek() + "max: "+stack.getMax() +"min: "+stack.getMin());

        stack.push(7);
        System.out.println("peek: " + stack.peek() + "max: "+stack.getMax() +"min: "+stack.getMin());

        stack.push(2);
        System.out.println("peek: " + stack.peek() + "max: "+stack.getMax() +"min: "+stack.getMin());

        stack.pop();
        System.out.println("peek: " + stack.peek() + "max: "+stack.getMax() +"min: "+stack.getMin());
    }


}

class MinMaxStack{

    ArrayList<MinMaxPair> stack;

    public MinMaxStack(){
        this.stack=new ArrayList<>();
    }

    public int peek(){
        return stack.get(stack.size()-1).value;
    }

    public void push(int val){
        if(stack.isEmpty()){
            MinMaxPair pair=new MinMaxPair(val,val,val);
            stack.add(stack.size(),pair);
        }else{
            int curMin=val;
            int curMax=val;
            if(stack.get(stack.size()-1).min<val){
                curMin=stack.get(stack.size()-1).min;
            }

            if(stack.get(stack.size()-1).max>val){
                curMax=stack.get(stack.size()-1).max;
            }

            MinMaxPair pair=new MinMaxPair(val,curMin,curMax);
            stack.add(stack.size(),pair);
        }
    }

    public int pop(){
        return stack.remove(stack.size()-1).value;
    }

    public int getMin(){
        return stack.get(stack.size()-1).min;
    }

    public int getMax(){
        return stack.get(stack.size()-1).max;
    }



    private class MinMaxPair{
        int value;
        int min;
        int max;

        MinMaxPair(int value,int min,int max){
            this.max=max;
            this.min=min;
            this.value=value;
        }
    }
}
