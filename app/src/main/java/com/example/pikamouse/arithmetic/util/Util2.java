package com.example.pikamouse.arithmetic.util;

/**
 * create by liting 2018/9/27
 * 最大公约数
 */
public class Util2 {

    public static void main(String[]args){
        System.out.print(new Util2().findMaxGongYueShu(222,407));
    }

    private int findMaxGongYueShu(int a, int b){
        int yu = 0;
        int beiChuShu = a > b ? a : b;
        int chuShu = a > b ? b : a;
        yu = beiChuShu % chuShu;
        while (yu != 0){
            beiChuShu = chuShu;
            chuShu = yu;
            yu = beiChuShu % chuShu;
        }
        return chuShu;
    }
}
