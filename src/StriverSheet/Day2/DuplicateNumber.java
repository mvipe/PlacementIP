package StriverSheet.Day2;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[]=new int[]{1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correctPos=nums[i]-1;
            if(i==correctPos){
                i++;
            }else{
                if(nums[i]==nums[correctPos]) return nums[i];
                //swap
                int temp=nums[i];
                nums[i]=nums[correctPos];
                nums[correctPos]=temp;
            }
        }

        return -1;
    }

}
