package StriverSheet.Day3;

public class ReversePairs {
    public static void main(String[] args) {
        int [] arr=new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(arr));
        System.out.println(2147483647/2>(2147483647));
    }

    public static int reversePairs(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                boolean cond1=(j<nums.length);
                boolean cond2=((long)nums[i]/2>(long) ( nums[j]));

                if(cond1 && cond2){
                    res++;
                }
            }
        }

        return res;
    }

//    public static int reversePairs(int[] nums) {
//        int res=0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                boolean cond1=(j<nums.length);
//                boolean cond2=((long)nums[i]/2>(long) ( nums[j]));
//
//                if(cond1 && cond2){
//                    res++;
//                }
//            }
//        }
//
//        return res;
//    }
}
