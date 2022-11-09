package StriverSheet.Day2;

import java.util.ArrayList;
import java.util.List;

public class RepeatedAndMissingNumberArray {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(2);
        A.add(2);

        System.out.println(repeatedNumber(A).toString());

    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> K) {
        ArrayList<Integer> A=new ArrayList<>();
        A.addAll(K);

        int i=0;
        ArrayList<Integer> res=new ArrayList<>();
        while(i<A.size()){
            int correctPos=A.get(i)-1;
            if(i==correctPos){
                i++;
            }else{
                if(A.get(i)==A.get(correctPos)) {
                    i++;
                }else{
                    //swap
                    int temp=A.get(i);
                    A.set(i,A.get(correctPos));
                    A.set(correctPos,temp);
                }
            }
        }



        //check for missing
        for (int j = 0; j < A.size() ; j++) {
            int correctPos=A.get(j)-1;
            if(correctPos!=j) {
                res.add(A.get(j));
                res.add(j+1);
                return res;
            }
        }

        return res;

    }
}
