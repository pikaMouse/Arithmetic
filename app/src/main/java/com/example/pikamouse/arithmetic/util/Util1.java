package com.example.pikamouse.arithmetic.util;

import java.util.Scanner;




public class Util1 {


        public static long trailingZeros(long n) {
            long count = 0;
            long temp=n/5;
            while (temp!=0) {
                count+=temp;
                temp/=5;
            }
            return count;
        }

        public static void main(String[]args){

            System.out.print(trailingZeros(101));
        }
}


