package com.example.pikamouse.arithmetic.string;

/**
 * create by liting 2018/10/10
 *
 *
 * https://blog.csdn.net/v_JULY_v/article/details/7041827
 */
public class KMP2 {



    public static void main(String[]args){

        String s1 = "abacdeftgtt";
        String s2 = "deft";
        int l = kmpMatch(s1,s2);
        String s = s1.substring(l,l + s2.length());
        System.out.print(s);

    }

    private static int violenceMatch(String s1,String s2){

        int len1 = s1.length();
        int len2 = s2.length();

        int i = 0;
        int j = 0;
        while(i < len1 && j < len2){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else {
                i = i - j + 1;
                j = 0;
            }
        }
        if(j == len2){
            return i - j;
        }else {
            return -1;
        }

    }

    private static int kmpMatch(String s1,String s2){
        int[] next = GetNext(s2);
        int len1 = s1.length();
        int len2 = s2.length();

        int i = 0;
        int j = 0;
        while(i < len1 && j < len2){
            if(j == -1 || s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else {
                j = next[j];
            }
        }
        if(j == len2){
            return i - j;
        }else {
            return -1;
        }

    }


    private static int[] GetNext(String p) {
        int pLen = p.length();
        int next[] = new int[pLen];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < pLen - 1)
        {
            //p[k]表示前缀，p[j]表示后缀
            if (k == -1 || p.charAt(j) == p.charAt(k))
            {
                ++k;
                ++j;
                next[j] = k;
            }
            else
            {
                k = next[k];
            }
        }
        return next;
    }

}
