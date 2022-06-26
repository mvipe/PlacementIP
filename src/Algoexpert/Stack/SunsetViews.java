package Algoexpert.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,4,4,3,1,3,2};
        System.out.println(sunsetViews(arr,"EAST").toString());
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
       ArrayList<Integer> list=new ArrayList<>();
       if(direction.equals("EAST")){
           int ngr[]=ngr(buildings);
           for (int i = 0; i < ngr.length; i++) {
               if(ngr[i]==-1){
                   list.add(i);
               }

           }
       }

        else{
            int ngl[]=ngl(buildings);
            for (int i = 0; i < ngl.length; i++) {
                if(ngl[i]==-1){
                    list.add(i);
                }

            }
        }

        return list;
    }

    //equal will also a ngr in this case
    private static int[] ngr(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int res[]=new int[arr.length];
        Arrays.fill(res,-1);

        for (int i = arr.length-1; i >=0 ; i--) {
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    if(arr[i]<=stack.peek()){
                        res[i]=stack.peek();
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            stack.push(arr[i]);
        }

        return res;

    }

    private static int[] ngl(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int res[]=new int[arr.length];
        Arrays.fill(res,-1);

        for (int i = 0; i <arr.length ; i++) {
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    if(arr[i]<=stack.peek()){
                        res[i]=stack.peek();
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            stack.push(arr[i]);
        }

        return res;

    }
}
