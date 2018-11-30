package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/9/24
 */
public class LeetCode729 {

    public static void main(String[]args){
        LeetCode729 l = new LeetCode729();
        int[]arr = new int[]{-1,-1,-1,-1,-1,0};
        System.out.print(l.pivotIndex(arr));
    }

    public int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int LSum = nums[0];
        int RSum = 0;
        for(int i = 0; i < nums.length; i++){
            RSum += nums[i];
        }
        if(LSum == RSum) return 0;
        for(int j = 1; j < nums.length; j++){
            LSum += nums[j];
            RSum -= nums[j - 1];
            if(LSum == RSum) return j;
        }
        return -1;
    }
}
