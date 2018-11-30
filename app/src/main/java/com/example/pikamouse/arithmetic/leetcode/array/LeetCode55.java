package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/10/17
 */
public class LeetCode55 {


    public static void main(String[]args){
        int[]arr = new int[]{3,2,1,0,4};
        System.out.println(new LeetCode55().canJump(arr));

    }

    public boolean canJump(int[] arr){
        int len = arr.length;
        int[]dp = new int[len];
        dp[0] = 1;
        boolean res = true;
        for(int i = 1; i < len; i++){
            for(int j = 0; j < i; j++){
                if(arr[j] >= i || arr[j + 1] + 1 >= i){
                    dp[i] = 1;
                }
            }
        }
        for(int i = 1; i < len; i++){
            if(dp[i] == 0){
                res = false;
            }
        }
        return res;
    }

}
