package Algoexpert.Stack;

import java.util.Arrays;
import java.util.Stack;
//not completed
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]=new int[]{
                2,5,-3,-4,6,7,2
        };

        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }

    public static int[] nextGreaterElement(int[] array) {
        // Write your code here.
        Pair[] ngl=ngl(array);
        Pair[] ngr=ngr(array);
        int res[]=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
           if(ngr[i].value!=-1){
               res[i]=ngr[i].value;
           }
        }

        return res;


    }

    private static Pair[] ngl(int[] arr) {
        Stack<Pair> stack=new Stack<>();
        Pair res[]=new Pair[arr.length];
        Arrays.fill(res,new Pair(-1,-1));

        for (int i = 0; i <arr.length ; i++) {
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    if(arr[i]<stack.peek().value){
                        res[i]=stack.peek();
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            stack.push(new Pair(i,arr[i]));
        }

        return res;

    }

    private static Pair[] ngr(int[] arr) {
        Stack<Pair> stack=new Stack<>();
        Pair res[]=new Pair[arr.length];
        Arrays.fill(res,new Pair(arr.length,-1));

        for (int i = arr.length-1; i >=0 ; i--) {
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    if(arr[i]<stack.peek().value){
                        res[i]=stack.peek();
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            stack.push(new Pair(i,arr[i]));
        }

        return res;

    }

    static class Pair{
        int index;
        int value;

        Pair(int index,int value){
            this.index=index;
            this.value=value;
        }
    }
}
