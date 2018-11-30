package com.example.pikamouse.arithmetic.leetcode.math;

/**
 * create by liting 2018/9/26
 */
public class Add {

    public static void main(String[]args){
        System.out.print(add(8,2));
    }



    private static String add(int a,int b){
        StringBuffer sb = new StringBuffer();
        String s1 = null;
        String s2 = null;
        if(a > b){
            s1 = String.valueOf(a);
            s2 = String.valueOf(b);
        }else {
            s1 = String.valueOf(b);
            s2 = String.valueOf(a);
        }
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int res = 0;
        int shi = 0;
        int ge = 0;
        while (i >= 0 && j >= 0){
            res = (s1.charAt(i) - '0') + (s2.charAt(j) - '0') + shi;
            shi = res / 10;
            ge = res % 10;
            sb.append(ge);
            i--;
            j--;
        }
        while (i >= 0){
            res = (s1.charAt(i) - '0')  + shi;
            shi = res/10;
            ge = res%10;
            sb.append(ge);
            i--;
        }
        if(shi != 0){
            sb.append(shi);
        }
        sb.reverse();
        return sb.toString();
    }
}
