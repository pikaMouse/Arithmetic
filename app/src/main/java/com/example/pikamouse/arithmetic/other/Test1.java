package com.example.pikamouse.arithmetic.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Create by jiangfeng on 2019/4/2
 * Email: 58113937@qq.com
 *
 * 备忘录Test1
 */
public class Test1 {

    public static void main (String[] args) {
        System.out.print(handle(new Integer[]{1,1,1,4,1,5}, 6));
    }


    private static int handle(Integer[] arr, int weight) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        int result = 0;
        int p = list.size() - 1;
        int q = 0;
        while (p >= 0) {
            if (list.get(p) + list.get(p - 1) <= weight) {
                result =  result + list.size()/2;
                if (list.size() % 2 == 0) {
                    return result;
                }
                return result + 1;
            } else {
                while (list.get(p) + list.get(q) <= weight && q < p) {
                    q++;
                }
                result++;
                result++;
                list.remove(p);
                list.remove(q);
                q = 0;
                p = list.size() - 1;
            }
        }
        return result;
    }
}
