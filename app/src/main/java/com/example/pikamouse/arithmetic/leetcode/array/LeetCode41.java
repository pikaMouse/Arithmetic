package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/10/2
 */
public class LeetCode41 {

    public static void main(String[]args){

        int[]arr = new int[]{1,2,0};
        System.out.print(new LeetCode41().firstMissingPositive(arr));

    }

    public int firstMissingPositive(int[] nums) {

            int len = nums.length;
            int max = 0;
            int result = 1;
            for(int i = 0; i < len; i++){
                max = Math.max(max,nums[i]);
                if(nums[i] <  0){
                    nums[i] = 0;
                }
            }
            int[]arr = new int[max + 2];
            for(int i = 0; i < len; i++){
                arr[nums[i]] = nums[i];
            }
            for(int i = 1; i < (max + 2); i++){
                if(nums[i] == 0){
                    result = i;
                    break;
                }
            }
            return result;
    }

}
