package com.example.pikamouse.arithmetic.dong_tai_gui_hua.yiwei;

/**
 * create by liting 2018/9/14
 *
 * 题目：袋鼠过河
 *
 *
 *
 * 示例输入：
 * 5
 * 2 0 1 1 1
 * 示例输出：
 * 4
 *
 *
 * 解法：dp数组存储了袋鼠跳跃的最小步数，初值为0
 *
 */
public class Example1 {


    public static void main(String[]args){
        int[]arr = new int[]{3,2,1,0,4};
        System.out.print(minJump(arr));

    }

    private static int minJump(int[]arr){
        if(arr.length == 0 || arr == null){
            return  0;
        }
        int len = arr.length;
        int[]dp = new int[len + 1];

        for(int i = 0; i < len + 1; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 1; i <= len; i++){
            for(int j = 0; j< i; j++){
                if(j + arr[j] >= i){
                    dp[i] = Math.min(dp[i],dp[j] + 1);
                }
            }
        }
        return (dp[len]==Integer.MAX_VALUE) || (dp[len] == Integer.MAX_VALUE + 1) ? -1 : dp[len];
    }

}


