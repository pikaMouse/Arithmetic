package com.example.pikamouse.arithmetic.test;

import java.util.Scanner;

/**
 * create by liting 2018/9/16
 */
public class Test5 {

    public static void main(String[]args){
        Scanner scanner  = new Scanner(System.in);
        int count = scanner.nextInt();
        int[]arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print(find(arr));
    }

    private static int find(int[]arr){
        if(arr.length == 0 || arr == null){
            return 0;
        }
        int result = 0;
        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count1++;
            }else {
                count0++;
            }
        }
        if(count1 == 1){
            result  = 1;
        }else if(count0 == 1){
            result = 2;
        }else {

        }

        return result;

    }
}
