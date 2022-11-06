package StriverSheet.Day1;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0) return res;
        //base case 1
        List<Integer> f1=new ArrayList<>();
        f1.add(1);
        res.add(f1);
        if(numRows==1) return res;


        for (int i=1;i<numRows;i++){
            List<Integer> ftemp=new ArrayList<>();
            ftemp.add(1);

            List<Integer> prevList=res.get(res.size()-1);
            for (int j = 1; j < prevList.size(); j++) {
                ftemp.add(prevList.get(j)+prevList.get(j-1));
            }

            ftemp.add(1);
            res.add(ftemp);
        }

        return res;




    }
}
