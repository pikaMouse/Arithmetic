package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/9/24
 */
public class LeetCode27 {

    public static void main(String[]args){
        LeetCode27 leetCode27 = new LeetCode27();
        //int[]array = new int[]{0,1,2,2,3,0,4,2};
        int[]array = new int[]{4,2,4,0,1,0,2};
        int len = leetCode27.removeElement(array,2);
        for(int i = 0; i < len; i++){
            System.out.print(array[i]);
        }
    }


    public int removeElement(int[] nums, int val) {
        int i = 0;
        int len = nums.length;
        for(int j = 0; j < len; j++ ){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
