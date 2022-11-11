package StriverSheet.Day3;

public class SearchIn2dMatrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0]>= target && matrix[i][matrix.length-1]<=target){
                //do a binary search
                return binarySearch(matrix[i],target);
            }
        }

        return false;
    }

    boolean binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target) return true;
            else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return false;
    }


}
