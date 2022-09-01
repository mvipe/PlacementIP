package triology;

public class test2 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,1};
        System.out.println(solve(arr,1));
    }


    static int solve(int arr[],int b){
       if(arr.length==0) return 0;

       int res=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            res=res | arr[i];
        }

        return res;
    }
}
