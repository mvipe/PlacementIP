package cognizant;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int mem[]=new int[10];
        Arrays.fill(mem,-1);
        System.out.println(solve(9,3,5,3,2,mem));
    }

    static int solve(int N,int P,int F,int U,int D,int mem[]){
        if(P==F) return 0;
        if(mem[P]!=-1) return mem[P];

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        if(P-D>=0){
            if(mem[P-D]!=-1) first=mem[P-D];
            else first=1+solve(N,P-D,F,U,D,mem);
        }
        if(P+U<N){
            if(mem[P+U]!=-1) second=mem[P-D];
            else second=1+solve(N,P+U,F,U,D,mem);
        }

        mem[P]= Math.min(first,second);
        return mem[P];

    }
}
