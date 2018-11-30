package com.example.pikamouse.arithmetic.util;

/**
 * create by liting 2018/11/18
 *
 * 大数相加
 *
 */
public class Util4 {

    public static void main(String[]args){
       //System.out.println(add(99999999,1));
        System.out.println(multiply("53","34"));
    }



    private static String add(int a,int b){
        StringBuffer sb1 = new StringBuffer(String.valueOf(a));
        StringBuffer sb2 = new StringBuffer(String.valueOf(b));
        int len1 = sb1.length();
        int len2 = sb2.length();
        sb1.reverse();
        sb2.reverse();
        if(len1 > len2){
            int r = len1 - len2;
            for(int i = 0; i < r; i++){
                sb2.append(0);
            }
        }else {
            int r = len2 - len1;
            for(int i = 0; i < r; i++){
                sb1.append(0);
            }
        }
        int len = sb1.length();
        int shi = 0;
        int ge = 0;
        int sum = 0;
        StringBuffer res = new StringBuffer();
        for(int i = 0; i < len; i++){
            sum = (sb1.charAt(i) - '0') + (sb2.charAt(i) - '0') + shi;
            shi = sum / 10;
            ge = sum % 10;
            res.append(ge);
        }
        if (shi != 0){
            res.append(1);
        }
        return res.reverse().toString();
    }

    public static String multiply(String num1, String num2){
        //把字符串转换成char数组
        char chars1[] = num1.toCharArray();
        char chars2[] = num2.toCharArray();

        //声明存放结果和两个乘积的容器
        int result[] = new int[chars1.length + chars2.length];
        int n1[] = new int[chars1.length];
        int n2[] = new int[chars2.length];

        //把char转换成int数组，为什么要减去一个'0'呢？因为要减去0的ascii码得到的就是实际的数字
        for(int i = 0; i < chars1.length;i++)
            n1[i] = chars1[i]-'0';
        for(int i = 0; i < chars2.length;i++)
            n2[i] = chars2[i]-'0';

        //逐个相乘，因为你会发现。AB*CD = AC(BC+AD)BD , 然后进位。
        for(int i =0 ; i < chars1.length; i++){
            for(int j =0; j < chars2.length; j++){
                result[i+j]+=n1[i]*n2[j];
            }
        }

        for(int i : result){
            System.out.print(i + " ");
        }
        System.out.println();

        //满10进位，从后往前满十进位
        for(int i =result.length-1; i > 0 ;i--){
            result[i-1] += result[i] / 10;
            result[i] = result[i] % 10;
        }
        for(int i : result){
            System.out.print(i + " ");
        }
        System.out.println();
        //转成string并返回
        String resultStr = "";
        for(int i = 0; i < result.length-1; i++){
            resultStr+=""+result[i];
        }
        return resultStr;
    }


}
