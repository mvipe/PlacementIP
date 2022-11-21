package StriverSheet.Day4;

import java.util.HashMap;

public class LargestSumWithSum0 {
    public static void main(String[] args) {

        //int arr[]=new int[]{15 ,-2, 2, -8, 1, 7, 10, 23};
        int arr[]=new int[]{
                -776, 794, 387, -648, 363,
                691, 764, -539 ,-171, -210,
                -566, 783, -861, 68, 930, -21,
                -68, 394, -10, -228, 422, 785, 199,
                -314, -412, -90, -955, 863, -995, 306,
                85, 337, 847, 314, 125, 583, 815, 435,
                -42, -86, -275, -787, -402, 755, 933,
                -675, -738, -225, -93, 796, -433, -466, 98, -316, -651,
                -300 ,-285, 866, 445, 441, 32, 98 ,482, 710, 568, -496, 587 ,307,
                220, -527, 733, 504 ,271, -707, 341, 797, 619, 847, 922, 380, -763, -840, -192, -33
        };
        System.out.println(maxLen(arr,84));

    }

    static int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ans=0;

        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
            if(sum==0) {
                ans=i+1;
            }
            if(map.get(sum)!=null){
                ans=Math.max(i-map.get(sum),ans);
            }else{
                map.put(sum,i);
            }
        }

        return ans;

    }
}
