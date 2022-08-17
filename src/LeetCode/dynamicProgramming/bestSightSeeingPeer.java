package LeetCode.dynamicProgramming;

public class bestSightSeeingPeer {

    public static void main(String[] args) {
        int arr[]=new int[]{8,1,5,2,6};

    }

    //optimized
    public int maxScoreSightseeingPair(int[] values) {
        int j=1;
        int max=-1;//max score

        if(values.length<2) return -1;

        int maxIthValue=values[0]+0;//A[i]=A[i]+i

        while(j<values.length){
            int jthValue=values[j]-j;
            max=Math.max(max,maxIthValue+jthValue);
            maxIthValue=Math.max(maxIthValue,values[j]+j);

            j++;
        }

        return max;


    }

//not optimized
    public static int maxScoreSightseeingPair(int[] values,int i,int j,int ind) {
        //base case
        if(i!=-1 && j!=-1){

            int score=values[i]+values[j]+i-j;
            return score;
        }
        if(ind>=values.length){
            return -1;
        }

        //
        if(i==-1){
            int takeIt=maxScoreSightseeingPair(values,ind,j,ind+1);
            int dontTakeIt=maxScoreSightseeingPair(values,i,j,ind+1);

            return Math.max(takeIt,dontTakeIt);
        }

        if(j==-1){
            int takeIt=maxScoreSightseeingPair(values,i,ind,ind+1);
            int dontTakeIt=maxScoreSightseeingPair(values,i,j,ind+1);

            return Math.max(takeIt,dontTakeIt);
        }

        return -1;



    }
}
