package com.example.pikamouse.arithmetic.test;

import java.util.Scanner;

/**
 * create by liting 2018/9/15
 */
public class Test2 {
    //以三边所在线段为矩形其中一边，
    //共有三种作法，
    //以最大边为一边的矩形面积最大。

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[][] m = new int[4][2];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                m[i][j] = scanner.nextInt();
            }
        }
        //直角三角形
        if(m[1][1] == m[0][1] && m[2][0] == m[0][0]){
            int square = 0;

            int square1 = Math.abs(m[3][0]) * Math.abs(m[3][1]);
            square = Math.max(square1,square);

            int square2 = (m[2][1] - m[3][1]) / 20 * m[1][0] * m[3][1];
            square = Math.max(square,square2);

            int square3 = m[2][1] * (m[1][0] - m[3][0]) / m[1][0]   * m[3][0];
            square = Math.max(square,square3);





            String s = square + ".000000";

            System.out.println(s);
            System.out.print(4);
        }
        //
    }


}
