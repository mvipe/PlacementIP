package Algoexpert.DynamicProgramming;

public class MinNoOfCoinsForChange {
    public static void main(String[] args) {
        int arr[]=new int []{1,5,10};
        System.out.println(solveTab(arr,7,arr.length));
    }

    private static int solveTab(int[] arr, int sum,int n) {
        int tab[][]=new int[n+1][sum+1];
        //initialization
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(j==0) tab[i][j]=0;
                else if(i==0) tab[i][j]=-1;
            }
        }

        //code
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if(arr[i-1]<=j){
                    int takeIt=tab[i][j-arr[i-1]];
                    int dontTakeIt=tab[i-1][j];

                    if(takeIt==-1 && dontTakeIt==-1){
                        tab[i][j]=-1;
                    }else if(takeIt==-1){
                        tab[i][j]=dontTakeIt;
                    }else if(dontTakeIt==-1){
                        tab[i][j]=1+takeIt;
                    }else{
                        tab[i][j] = Math.min(1+tab[i][j-arr[i-1]] ,tab[i-1][j]);
                    }

                }

                else {
                    tab[i][j]=tab[i-1][j];
                }
            }
        }





        return tab[n][sum];
    }
}
