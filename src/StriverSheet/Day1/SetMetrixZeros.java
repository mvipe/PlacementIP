package StriverSheet.Day1;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//link:https://leetcode.com/problems/set-matrix-zeroes/

public class SetMetrixZeros {
    public static void main(String[] args) {
//        int matrix[][]=new int[][]{
//                {0,1,2,0}
//                ,{3,4,5,2},
//                {1,3,1,5}
//        };

        int matrix[][]=new int[][]{
                {0,1}
        };


        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();

        setZeroes(matrix);
        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    public static void setZeroes(int[][] matrix) {
        Map<String,Integer> zeroMap=new HashMap<>() ;

        for (int i=0;i<matrix.length;i++){
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0) {
                    String str=i+"-"+j;
                    zeroMap.put(str,j);
                }
            }
        }

        for (int i=0;i<matrix.length;i++){
            for (int j = 0; j < matrix[0].length; j++) {
                String str=i+"-"+j;

                if(zeroMap.get(str)!=null){
                    makeRowZero(i,matrix);
                    makeColZero(j,matrix);

                }
            }
        }


    }

    static void makeRowZero(int row,int[][] matrix){
        for (int j=0;j<matrix[0].length;j++){
            matrix[row][j]=0;
        }
    }

    static void makeColZero(int col,int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
}
