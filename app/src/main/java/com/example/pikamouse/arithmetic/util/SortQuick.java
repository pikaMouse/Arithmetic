package com.example.pikamouse.arithmetic.util;

/**
 * create by liting 2018/9/20
 */
public class SortInsert {


    public static void main(String[]args){
        int[]arr = new int[]{3,2,5,6,7,1,9};
        sort(arr);
        for(int i : arr){
            System.out.print(i);
        }
    }

    private static void sort(int[]arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }


    private static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
