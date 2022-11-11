package StriverSheet.Day3;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],1+map.getOrDefault(nums[i],0));
            if(map.get(nums[i])>nums.length/2) return nums[i];
        }

        return -1;
    }
}
