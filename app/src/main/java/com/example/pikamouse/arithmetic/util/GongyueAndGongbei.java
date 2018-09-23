package com.example.pikamouse.arithmetic.util;

/**
 * create by liting 2018/9/14
 */
public class GongyueAndGongbei {

    public static void main(String[] args) {
        System.out.println("222和407的最大公约数是："+gongyue(222,407));
        System.out.println("222和407的最小公倍数是："+gongbei(222,407));
    }
    //求最小公倍数
    static int gongbei(int a,int b)
    {
        return (a*b)/gongyue(a,b);
    }
    //求最大公约数函数
    static int gongyue(int a,int b)
    {
        int gongyue=0;
        if(a<b)
        {   //交换a、b的值
            a=a+b;
            b=a-b;
            a=a-b;
        }
        if(a%b==0)
        {
            gongyue = b;
        }
        while(a % b>0)
        {
            a=a%b;
            if(a<b)
            {
                a=a+b;
                b=a-b;
                a=a-b;
            }
            if(a%b==0)
            {
                gongyue = b;
            }
        }
        return gongyue;
    }
}
