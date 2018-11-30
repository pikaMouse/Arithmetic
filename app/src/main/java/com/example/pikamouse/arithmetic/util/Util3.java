package com.example.pikamouse.arithmetic.util;

/**
 * create by liting 2018/9/27
 * 判断一个数为素数
 */
public class Util3 {

    public static void main(String[]args){
        if(isPrime(25)){
            System.out.print("yes");

        }
    }


    public static boolean isPrime(int num) {
        if (num <= 3) {
            return num > 1;
        }
        // 不在6的倍数两侧的一定不是质数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;

    }
}
