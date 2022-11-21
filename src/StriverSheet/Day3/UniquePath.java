package StriverSheet.Day3;

import java.util.Arrays;

public class UniquePath {

    public static void main(String[] args) {
        System.out.println(uniquePaths(23,12));
    }

    public static int uniquePaths(int r, int c) {
        int mem[][]=new int[r+1][c+1];
        for (int i = 0; i <mem.length ; i++) {
            Arrays.fill(mem[i],-1);
        }
        return uniquePaths(r,c,mem);
    }

    public static int uniquePaths(int r, int c,int mem[][]) {
        if(r==1 && c==1) return 1;
        if(mem[r][c]!=-1) return mem[r][c];
        int res=0;
        if(r>1) {
            res+=uniquePaths(r-1,c,mem);

        }
        if(c>1){
            res+=uniquePaths(r,c-1,mem);
        }

        mem[r][c]=res;

        return mem[r][c];
    }
}
