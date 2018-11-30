package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/9/26
 *
 * 最短需要排序的数组
 */
public class Array4 {

    public static void main(String[]args){
        int[]arr = new int[]{1,5,3,4,2,6,7};
        System.out.print(getMinLength(arr));
    }

    private static int getMinLength(int[]arr){
        if(arr == null || arr.length < 2){
            return 0;
        }
        int min = arr[arr.length - 1];
        int noMinIndex = -1;
        for(int i = arr.length - 2; i != -1; i--){
            if(arr[i] > min){
                noMinIndex = i;
            }else {
                min = Math.min(arr[i],min);
            }
        }
        if(noMinIndex == -1){
            return 0;
        }
        int max = arr[0];
        int noMaxIndex = -1;
        for(int i = 1; i != arr.length; i++){
            if(arr[i] < max){
                noMaxIndex = i;
            }else {
                max = Math.max(arr[i],max);
            }
        }

        return noMaxIndex - noMinIndex + 1;
    }
}
