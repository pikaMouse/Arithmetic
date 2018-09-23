package com.example.pikamouse.arithmetic.string;

/**
 * create by liting 2018/9/16
 */
public class StringQuestion2 {

    //1.统计一个字符串在另一个字符串中出现的次数
    public static int stringCount(String str,String key){
        int index=0;
        int count=0;
        while((index=str.indexOf(key))!=-1){
            str=str.substring(index+key.length());
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str="ababab";
        String key="ab";
        int count=stringCount(str,key);
        System.out.println(count);
    }
}
