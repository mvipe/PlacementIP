package Algoexpert.DynamicProgramming;

import java.util.Arrays;

public class lavensteinDistance {
    public static void main(String[] args) {
        System.out.println(levenshteinDistance("abc","yabd"));
    }

    public static int levenshteinDistance(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();

        //matrix declaration
        int tab[][]=new int [m+1][n+1];

        //initialization
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i==0) tab[i][j]=j;
                if(j==0) tab[i][j]=i;
            }
        }

        //
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n ; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)) {
                    tab[i][j]=tab[i-1][j-1];
                }else{
                    tab[i][j]=1+ Math.min(tab[i-1][j-1], Math.min(tab[i][j-1],tab[i-1][j]));
                }
            }
        }

//        for (int i = 0; i <=m ; i++) {
//            System.out.println(Arrays.toString(tab[i]));
//        }
        return tab[m][n];
    }
}
