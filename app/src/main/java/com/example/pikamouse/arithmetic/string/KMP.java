package com.example.pikamouse.arithmetic.string;

/**
 * create by liting 2018/9/27
 */
public class KMP {

    public static void main(String[]args){
        new KMP().cal_next("abcab");
    }

   private  int[] cal_next(String str)
    {
        int len = str.length();
        int[]next = new int[len];
        next[0] = -1;//next[0]初始化为-1，-1表示不存在相同的最大前缀和最大后缀
        int k = -1;//k初始化为-1
        for (int q = 1; q <= len-1; q++)
        {
            while (k > -1 && str.charAt(k+1) != str.charAt(q))//如果下一个不同，那么k就变成next[k]，注意next[k]是小于k的，无论k取任何值。
            {
                k = next[k];//往前回溯
            }
            if (str.charAt(k+1) == str.charAt(q))//如果相同，k++
            {
                k = k + 1;
            }
            next[q] = k;//这个是把算的k的值（就是相同的最大前缀和最大后缀长）赋给next[q]
        }


        for(int i : next){
            System.out.print(i + "  ");
        }


        return next;
    }


}
