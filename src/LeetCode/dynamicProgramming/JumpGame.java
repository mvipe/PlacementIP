package LeetCode.dynamicProgramming;
//https://leetcode.com/problems/jump-game/submissions/
public class JumpGame {

    public static void main(String[] args) {

    }

    public boolean canJumpMeemo(int[] nums,int ind,int mem[]) {
        //base case
        if(ind==nums.length-1) return true;
        if(ind>nums.length-1) return false;

        if(mem[ind]!=-1){
            return mem[ind]==1? true : false;
        }

        int maxJump=nums[ind];

        Boolean canReach=false;
        for (int i = 1; i <=maxJump ; i++) {
            canReach=canJumpMeemo(nums,ind+i,mem);
            mem[ind+i]=canReach? 1 : 0;
            if(canReach) {
                return mem[ind+i]==1? true : false;
            }
        }

        return canReach;
    }

    public boolean canJump(int[] nums,int ind) {
        //base case
        if(ind==nums.length-1) return true;
        if(ind>nums.length-1) return false;

        int maxJump=nums[ind];

        Boolean canReach=false;
        for (int i = 1; i <=maxJump ; i++) {
            canReach=canJump(nums,ind+i);
            if(canReach) return true;
        }

        return canReach;
    }
}
