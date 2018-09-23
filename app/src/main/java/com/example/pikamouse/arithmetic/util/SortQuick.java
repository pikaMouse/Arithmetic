package com.example.pikamouse.arithmetic.util;

/**
 * create by liting 2018/9/20
 */
public class SortQuick {


    public static void main(String[]args){
        int[]arr = new int[]{3,2,5,6,7,1,9};
        sort(arr,0,arr.length - 1);
        for(int i : arr){
            System.out.print(i);
        }
    }

    private static void sort(int[]arr,int left,int right){
        if(left < right){
            int pivot = partition(arr,left,right);
            sort(arr,left,pivot - 1);
            sort(arr,pivot + 1,right);
        }
    }

    private static int partition(int[]arr,int left,int right){
        int pivot = arr[left];
        while (left < right){
            while (left < right && arr[right] >= pivot){
                right--;
            }
            swap(arr,left,right);
            while (left < right && arr[left] <= pivot){
                left++;
            }
            swap(arr,left,right);
        }
        return left;
    }


    private static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



}
