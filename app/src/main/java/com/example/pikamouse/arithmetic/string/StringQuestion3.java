package com.example.pikamouse.arithmetic.string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * create by liting 2018/9/21
 */
public class StringQuestion3 {

    public static void main(String[]args){
        String[]strings = new String[]{"bytedance","toutiaohao","toutiaoapp","iesaweme","iestiktok"};
        find(strings);
    }

    private static void find(String[]strings){
        if(strings.length == 0 || strings == null){
            return;
        }
        int len = strings.length;
        List<String>list = new ArrayList<>();
        int i = 0;
       while (i < len){
            String s1 = strings[i];
            String s2 = strings[i + 1];

            if(s1.charAt(0) == s2.charAt(0)){
                String s = findSameString1(s1,s2);

                StringBuffer sb1 = new StringBuffer();
                sb1.append(s);
                if(s1.length() > s.length()){
                    sb1.append(s1.charAt(s.length()));
                }
                StringBuffer sb2 = new StringBuffer();
                sb2.append(s);
                if(s2.length() > s.length()){
                    sb2.append(s2.charAt(s.length()));
                }

                list.add(sb1.toString());
                list.add(sb2.toString());
                i = i + 2;
            }else{
                list.add(s1.charAt(0)+"");
                i++;
            }
        }

        for(String s : list){
            System.out.println(s);
        }
    }

    /**
     * 返回头部最长公共子序列
     * @param s1
     * @param s2
     * @return
     */
    private static String findSameString1(String s1,String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int start1 = 0;
        int start2 = 0;
        StringBuffer sb = new StringBuffer();
        while (start1 < l1 && start2 < l2){
            if(s1.charAt(start1) == s2.charAt(start2)){
                sb.append(s1.charAt(start1));
                start1++;
                start2++;
            }else {
                break;
            }
        }
        return sb.toString();

    }

    /**
     * 返回最长公共子序列
     * @param s1
     * @param s2
     * @return
     */
    private static String findSameString2(String s1,String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int[][]dp = new int[l1 + 1][l2 + 1];
        int maxLen = 0;
        int end = 0;
        for(int i = 0; i <= l1; i++){
            for(int j = 0; j <= l2; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(dp[i][j] > maxLen){
                        maxLen = dp[i][j];
                        end = i;//记录最长位置的字串
                    }
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        int start = end - maxLen;
        String s = s1.substring(start,end);
        return s;

    }
}
