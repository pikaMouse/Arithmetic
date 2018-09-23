package com.example.pikamouse.arithmetic.leetcode;

/**
 * create by liting 2018/9/14
 *
 *
 * 题目：
 *
 * 例子：
 *
 * 解法：
 *
 * 状态：未解决
 */
public class LeetCode65 {

    public static void main(String[]args){

        System.out.print(isNumber1(".3"));

    }

    /**
     * 我的答案
     * 未解决
     * @param str
     * @return
     */
    private static boolean isNumber(String str) {
        String s = str.trim();
        if(s.length() == 0 || s == null){
            return false;
        }
        boolean result = true;
        String[] ss = s.split("\\.");
        if(ss.length == 0 || ss.length > 2){
            return false;
        }
        for(int i = 0; i < ss.length; i++){
            int l = ss[i].length();
            if(l == 0){
                continue;
            }
            for(int j = 0; j < l; j++){
                char c = ss[i].charAt(j);
                int ci = c - '0';
                if((ci < 0 || ci > 9)  ){
                    result = false;
                    break;
                }
         }
        }
        return result;
    }

    /**
     * 别人的答案
     * 已解决
     * @param s
     * @return
     */
    private static boolean isNumber1(String s) {
        boolean point = false;
        boolean number = false;
        boolean fuhao = false;
        int exc = -1;
        s = s.trim();

        if (s.length() < 1 || (s.charAt(s.length()-1) != '.' && !Character.isDigit(s.charAt(s.length() - 1)))) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!isValidChar(ch)) return false;
            if (Character.isDigit(ch)) {
                number = true;
            }
            if (ch == 'e' || ch == 'E') {
                if (exc != -1 || !number) {
                    return false;
                }
                exc = i;
            }
            if (ch == '.') {
                if ((i > 1  && (!number || exc != -1 || point)) || (i == 1 && !fuhao&&!number) ) {
                    return false;
                }
                point = true;
            }
            if (ch == '+' || ch == '-') {
                if (i != 0 && i != exc + 1) {
                    return false;
                }
                fuhao = true;
            }
        }
        if (!number) {
            return false;
        }
        return true;
    }
    private static boolean isValidChar(char ch){
        if (ch == '+' || ch == '-' || ch == '.' || ch == 'e' || ch == 'E' || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }
}
