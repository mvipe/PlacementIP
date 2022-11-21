package StriverSheet.Day4;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();//num,ind

        int res[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i])!=null){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
            }else{
                map.put(nums[i],i);
            }
        }

        return res;
    }
}
