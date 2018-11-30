package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/10/12
 */
public class LeetCode53 {

    public static void main(String[]args){
        int[]arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int right = 0;
        int len = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        while(right < len){
            sum = sum + nums[right];
            if(sum < nums[right]){
                sum = nums[right];
                right++;
            }else {
                right++;
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
