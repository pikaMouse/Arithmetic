package com.example.pikamouse.arithmetic.test;

import java.util.Scanner;

/**
 * create by liting 2018/9/16
 */
public class Test4 {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[]array = new int[count];
        for(int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < count; i++){
            String s = array[i] + "";
            int sum = 0;
            int len = s.length();
            for(int j = 0; j < len; j++){
                sum = sum + (s.charAt(j) - '0');
            }
            if(array[i] % sum == 0){
                if(i == count - 1)
                    System.out.print("Yes");
                else
                    System.out.println("Yes");

            }else {
                if(i == count - 1)
                    System.out.print("No");
                else
                    System.out.println("No");
            }
        }
    }
}
