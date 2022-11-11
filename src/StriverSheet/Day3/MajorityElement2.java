package StriverSheet.Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {

    }

    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],1+map.getOrDefault(nums[i],0));
            if(map.get(nums[i])>nums.length/3) {
                if(!res.contains(nums[i])){
                    res.add(nums[i]);
                }
            }
        }

        return res;
    }
}
