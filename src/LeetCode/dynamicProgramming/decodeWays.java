package LeetCode.dynamicProgramming;

import java.util.Arrays;

//https://leetcode.com/problems/decode-ways/
public class decodeWays {
    public static void main(String[] args) {
        System.out.println(numDecodingsTab("06"));
    }

    //not fully solved
    public static   int numDecodingsTab(String s) {
        if(s.length()==0) return 0;
        int tab[]=new int[s.length()];
        //initialization
       Arrays.fill(tab,0);

        if(Integer.parseInt(s.substring(0,1))>0){
            tab[0]=1;
            tab[1]=1;
        }
        if(s.length()==1) return tab[0];
        if(Integer.parseInt(s.substring(0,2))<=26 && Integer.parseInt(s.substring(0,2))>=10){
            tab[1]=2;
        }

        for (int i=2;i<s.length();i++){
            if(s.charAt(i)>0){
                tab[i]+=tab[i-1];
            }
            if(Integer.parseInt(s.substring(i-1,i+1))>=10 && Integer.parseInt(s.substring(i-1,i+1))<=26){
                tab[i]+=tab[i-2];
            }
        }

        return tab[s.length()-1];
    }

    public static   int numDecodings(String s) {
        int mem[]=new int[s.length()];
        Arrays.fill(mem,-1);
        return numDecodings(s,0,mem);
    }

    public static int numDecodings(String s,int ind,int mem[]) {
        if(ind==s.length()) return 1;
        if(ind>s.length()) return 0;
        if(mem[ind]!=-1) return mem[ind];

        //
        int res=0;
        int sVal=Integer.parseInt(s.substring(ind,ind+1));
        if(sVal<=26 && sVal>=1){
            int single=numDecodings(s,ind+1,mem);
            res=res+single;
        }

        if(s.length()-ind>=2){
            int dVal=Integer.parseInt(s.substring(ind,ind+2));
            if(dVal<=26 && dVal>=10){
                int doubl=numDecodings(s,ind+2,mem);
                res=res+doubl;
            }
        }

        mem[ind]=res;




        return mem[ind];


    }
}
