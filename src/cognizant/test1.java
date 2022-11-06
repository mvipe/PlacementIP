package cognizant;

public class test1 {
    public static void main(String[] args) {
        int arr[]=new int[]{-1,-9,0,5,-7};
        System.out.println(solve(arr));
    }

    static int solve(int arr[]){
        int res=0;
        int cur=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                cur++;
                res+=arr[i]*cur;
            }else if(i!=arr.length-1){
                if(Math.abs(arr[i])<Math.abs(arr[i+1])){
                    cur++;
                    res+=arr[i]*cur;
                }
            }
        }

        return res;
    }

}
