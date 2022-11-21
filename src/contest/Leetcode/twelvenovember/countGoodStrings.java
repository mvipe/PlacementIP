package contest.Leetcode.twelvenovember;

import java.util.HashMap;
//not solved
public class countGoodStrings {
    public static void main(String[] args) {
        System.out.println(countGoodStrings(1000,1000,6,9));
    }

    public static int countGoodStrings(int low, int high, int zero, int one) {
        HashMap<Integer,Integer> mem=new HashMap<>();
        return countGoodStrings(low,high,zero,one,0,mem)%1000000007;
    }

    public static int countGoodStrings(int low, int high, int zero, int one,int s_length,HashMap<Integer,Integer> mem) {

        if(s_length>high) return 0;
        if(mem.getOrDefault(s_length,0)!=0){
            return mem.get(s_length%(1000000007))%(1000000007);
        }
        if(s_length>=low && s_length<=high){
            int zer=countGoodStrings(low,high,zero,one,s_length+zero,mem);
            mem.put((s_length+zero)%(1000000007),zer%(1000000007));
            int on=countGoodStrings(low,high,zero,one,s_length+one,mem);
            mem.put((s_length+one)%(1000000007),on%(1000000007));
            mem.put(s_length%(1000000007),(1+zer+on)%(1000000007));
            return mem.get(s_length);
        }
        else{
            int zer=countGoodStrings(low,high,zero,one,s_length+zero,mem);
            mem.put((s_length+zero)%(1000000007),zer%(1000000007));
            int on=countGoodStrings(low,high,zero,one,s_length+one,mem);
            mem.put((s_length+one)%(1000000007),on%(1000000007));
            mem.put(s_length%(1000000007),(zer+on)%(1000000007));
            return mem.get(s_length);
        }
    }
}
