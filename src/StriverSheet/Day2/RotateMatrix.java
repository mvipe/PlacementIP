package StriverSheet.Day2;

public class RotateMatrix {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {

        //transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //mirror
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length/2 ; j++) {
                int n=matrix[0].length-1;
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j];
                matrix[i][n-j]=temp;
            }
        }


    }
}
