package com.example.pikamouse.arithmetic.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * create by liting 2018/9/14
 *
 * 题目：
 *
 * 例子：
 *
 * 解法：
 *
 *
 */
public class LeetCode3 {

    public static void main(String[]args){
        System.out.print(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        List<Character>list = new ArrayList<>();
        int right = 0;
        int maxLen = 0;
        while(right < s.length()){
            if(!list.contains(s.charAt(right))){
                list.add(s.charAt(right));
                right++;
            }else {
                list.remove(0);

            }
            maxLen = Math.max(maxLen,list.size());
        }
        return maxLen;

    }
}
