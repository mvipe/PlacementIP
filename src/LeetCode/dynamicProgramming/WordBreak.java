package LeetCode.dynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        int mem[]=new int[s.length()+1];
        Arrays.fill(mem,-1);
        return wordBreak(s,wordDict,0,mem);
    }


    public boolean wordBreak(String s, List<String> wordDict,int ind,int mem[]) {

        if (ind>=s.length()) return true;
        if(mem[ind]!=-1) return mem[ind]==0?false:true;

        boolean res=false;

        for (String el:wordDict){
            if(el.length()<=(s.length()-ind)){
                boolean temp=s.substring(ind,ind+el.length()).equals(el);
                if(temp){
                    res=wordBreak(s,wordDict,ind+el.length(),mem);
                    if(res) {
                        mem[ind]= res? 1:0;
                        return mem[ind]==1?true:false;
                    }
                }
            }
        }

        mem[ind]=res?1:0;

        return mem[ind]==1?true:false;
    }
}
