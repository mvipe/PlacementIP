package StriverSheet.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//https://leetcode.com/problems/merge-intervals/submissions/
public class MergeIntervals {
    public static void main(String[] args) {
int[][] m=new int[][]{
        {1,4},{0,4}
};



    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        //
        int[] s1=new int[2];
        s1[0]=intervals[0][0];
        s1[1]=intervals[0][1];

        res.add(s1);

        for (int i = 1; i < intervals.length; i++) {
            int[] temp=res.get(res.size()-1);

            if(temp[1]>=intervals[i][0]){
                if(temp[1]<intervals[i][1]){
                    temp[1]=intervals[i][1];
                    res.remove(res.size()-1);
                    res.add(temp);
                }
            }else{
                res.add(intervals[i]);
            }


        }

        int[][] resArr=new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            resArr[i]=res.get(i);
        }

        return resArr;

    }
}
