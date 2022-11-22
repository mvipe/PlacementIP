package StriverSheet.Day4;

import java.io.FilterOutputStream;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
   int arr[]=new int[]{1,0,-1,0,-2,2};
        System.out.println(fourSum(arr,0).get(1).toString());
    }

    //3ptr + binary search
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        int k=j+1;

        List<List<Integer>> res=new ArrayList<>();

        while (i<nums.length-3 ){
            if(k>=nums.length-2){
                j=j+1;
                k=j+1;
                continue;
            }else if(j>=nums.length-3){
                i=i+1;
                j=i+1;
                k=j+1;
                continue;
            }
            int sum_3=nums[i]+nums[j]+nums[k];
            if(binarySearch(nums,target-sum_3,k+1,nums.length-1)){
                List<Integer> list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                list.add(target-sum_3);

                res.add(list);
            }
            k++;
        }

        return res;
    }


    public static boolean binarySearch(int arr[],int target,int start,int end){
        System.out.println(target);

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
