package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/9/26
 */
public class Array3 {

    public static void main(String[]args){


        int[]arr = new int[]{0,1,2,2,3,4,5,6,7,8,9};
        int T1 = 0;
        int T2 = arr[0];
        for(int i = 1; i < 10; i++){
            T1 = T1 ^ i;
        }
        for(int i = 1; i < arr.length; i++){
            T2 = T2 ^ arr[i];
        }
        System.out.print(T1 ^ T2);

    }



}
