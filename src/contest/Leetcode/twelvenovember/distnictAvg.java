package contest.Leetcode.twelvenovember;

import java.util.*;

public class distnictAvg {
    public static void main(String[] args) {
        int nums[]=new int[]{4,1,4,0,3,5};
        System.out.println(distinctAverages(nums));
    }

    public static int distinctAverages(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Set<Double> set=new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list);

        while(!list.isEmpty()){
            int n1=list.get(0);
            int n2=list.get(list.size()-1);

            double n= (n1+n2)/2.0;


            set.add(n);

            list.remove(0);
            list.remove(list.size()-1);
        }

        return set.size();


    }
}
