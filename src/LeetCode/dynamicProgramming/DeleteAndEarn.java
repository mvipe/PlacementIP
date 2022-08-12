package LeetCode.dynamicProgramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class DeleteAndEarn {
    public static void main(String[] args) {
        int arr[]=new int[]{2,2,3,3,3,4};
        System.out.println(deleteAndEarnn(arr));
    }

    public static int deleteAndEarnn(int[] nums) {
        int inc=0;
        int exc=0;

        int count[]=new int[10001];

        for(int el:nums) count[el]++;
        for(int i=0;i<count.length;i++){
            int onInc=(i*count[i]) + exc;
            int onExc=Math.max(inc,exc);

            inc=onInc;
            exc=onExc;
        }

        return Math.max(inc,exc);
    }


    //brute force
    public static int deleteAndEarn(int[] nums) {

        ArrayList<Integer> list=new ArrayList<>();
       for (int el : nums){
           list.add(el);
       }

       return deleteAndEarn(list);
    }


    //brute force
    public static int deleteAndEarn(ArrayList<Integer> nums) {

        if(nums.size()==0) return 0;

        int max=Integer.MIN_VALUE;

        HashMap<Integer,Integer> tab=new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {

            if(tab.get(nums.get(i))!=null){
                //continue;
            }else{
                ArrayList<Integer> remainingList= new ArrayList<>();

                for (int j = 0; j < nums.size(); j++) {
                    if((nums.get(j)!=nums.get(i)-1 && nums.get(j)!=nums.get(i)+1) && j!=i ){
                        remainingList.add(nums.get(j));
                    }
                }


                int res=nums.get(i)+deleteAndEarn(remainingList);
                tab.put(nums.get(i),res);
                max=Math.max(max,res);
            }



        }

        return max;
    }
}
