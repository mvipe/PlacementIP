package LeetCode.dynamicProgramming;

import java.util.HashMap;

//https://leetcode.com/problems/arithmetic-slices-ii-subsequence/
public class ArithmeticSlices2 {
    public static void main(String[] args) {

    }

    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int res=0;

        HashMap<Integer,Integer>[] map=new HashMap[nums.length];
        //initialize the map
        for(int i=0;i<nums.length;i++){
            map[i]=new HashMap<>();
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                long diff=nums[i]-nums[j];
                if(diff>Integer.MAX_VALUE || diff<Integer.MIN_VALUE){
                    continue;
                }
                int prevAtJ=map[j].getOrDefault(diff,0);
                int prevAtI=map[i].getOrDefault(diff,0);
                int prev=prevAtI+prevAtJ;
                map[i].put((int)diff,prev+1);
                if(prevAtJ>=1){
                    res+=(prevAtJ);
                }
            }
        }

        return res;
    }
}
