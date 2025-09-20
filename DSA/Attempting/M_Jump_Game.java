package Leetcode;

public class M_Jump_Game {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }
    static boolean canJump(int[] nums) {
//        works only when the each element of the array is the defined jump... not the maximum jump we have to find for the maximum jump
//        int jump = 0;
//        int i = 0;
//        while(i < nums.length){
//            if(nums.length == 1) return true;
//            if(nums[i] != 0){
//                jump = nums[i];
//            } else {
//                break;
//            }
//
//            if(nums[i] == nums[nums.length-1]){
//                return true;
//            }
//            i = i + jump;
//        }
//        return false;


        //greedy approach yet to learn about it
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false; // If current position is not reachable
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
