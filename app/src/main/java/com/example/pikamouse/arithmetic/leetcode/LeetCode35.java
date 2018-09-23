package com.example.pikamouse.arithmetic.leetcode;

/**
 * create by liting 2018/9/21
 */
public class LeetCode35 {

    public static void main(String[]args){
        int[]arr = new int[]{1,3,5,6};
        System.out.print(searchInsert(arr,0));

    }

    private static int searchInsert(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int len = nums.length;
        int i = 0;
        while (i < len){
            if(nums[i] < target){
                i++;
            }else {
                return i;
            }
        }
        return i;

    }
}
