package com.example.pikamouse.arithmetic.dong_tai_gui_hua.erwei;

/**
 * create by liting 2018/9/16
 */
public class Example3 {

    public static void main(String[]args){

        String s1 = "abcdefcc";
        String s2 = "cbcdfcc";
        System.out.print(find(s1,s2));

    }

    private static int find(String s1,String s2){
        if(s1.length() == 0 || s2.length() == 0 || s1 == null || s2 == null){
            return 0;
        }
        int len1 = s1.length();
        int len2 = s2.length();
        int[][]dp = new int[len1 + 1][len2 + 1];

        for(int i = 0; i <= len1; i++){
            for(int j = 0; j <= len2; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i -1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j -1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
