package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/9/25
 */
public class Array1 {

    public static void main(String[]args){
        int[]arr = new int[]{1,2,2,0,0,1,2,1,0,2};
        order(arr);
        for(int i : arr){
            System.out.print(i);
        }

    }

    private static void order(int[]arr){
        if(arr == null || arr.length == 0){
            return;
        }
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        int middle = 0;
        while(middle < right){
            while (arr[left] == 0){
                left++;
                middle++;
            }
            while (arr[right] == 2){
                right--;
            }
            if(arr[right] == 0){
                swap(arr,left,right);
                left++;
                middle++;
            }
            if(arr[left] == 2){
                swap(arr,left,right);
                right--;
            }
            while (arr[middle] == 1){
                middle++;
            }
            if(arr[middle] == 0){
                swap(arr,left,middle);
                left++;
                middle++;
            }
            if(arr[middle] == 2){
                swap(arr,right,middle);
                right--;
            }

        }
    }
    private static void swap(int[]arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
