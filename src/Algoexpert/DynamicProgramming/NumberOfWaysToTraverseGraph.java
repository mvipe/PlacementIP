package Algoexpert.DynamicProgramming;

public class NumberOfWaysToTraverseGraph {
    public static void main(String[] args) {
        System.out.println(numberOfWaysToTraverseGraph(4,3));
    }

    public static int numberOfWaysToTraverseGraph(int width, int height) {
       //base case
        if(width==1 && height==1){
            return 1;
        }
        //
        int totalWays=0;
        if(width!=1){
            totalWays+=numberOfWaysToTraverseGraph(width-1,height);
        }

        if(height!=1){
            totalWays+=numberOfWaysToTraverseGraph(width,height-1);
        }

        return totalWays;

    }
}
