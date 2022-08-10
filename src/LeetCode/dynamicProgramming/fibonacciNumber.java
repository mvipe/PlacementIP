package LeetCode.dynamicProgramming;
//https://leetcode.com/problems/fibonacci-number/submissions/
public class fibonacciNumber {

    public int fib(int n) {
        if(n==0 || n==1) return n;

        int tab[]=new int[n+1];
        //initialization
        tab[0]=0;
        tab[1]=1;

        for(int i=2;i<tab.length;i++){
            tab[i]=tab[i-1]+tab[i-2];
        }

        return tab[n];
    }
}
