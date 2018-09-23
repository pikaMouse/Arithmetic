package com.example.pikamouse.arithmetic.test;

import java.util.Scanner;

/**
 * create by liting 2018/9/16
 */
public class Test6 {


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        System.out.print(fun(s1,s2));
    }

    private static int fun(String s1,String s2){
        if(s1.length() == 0 || s2.length() == 0 || s1 == null || s2 == null){
            return 0;
        }
        int result = 0;
        if(s1.substring(0,s2.length()).equals(s2)){
            result =  s1.length() * s1.length();
        }else {
            int count = stringCount(s1,s2);
            result = (count * s2.length() ) * (count * s2.length() );
        }

        return result;
    }

    private static int stringCount(String str,String key){
        int index=0;
        int count=0;
        while((index=str.indexOf(key))!=-1){
            str=str.substring(index+key.length());
            count++;
        }

        return count;
    }
}
