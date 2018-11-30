package com.example.pikamouse.arithmetic.leetcode.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * create by liting 2018/10/13
 */
public class LeetCode349 {



    public static void main(String[]args){
        int[]arr1 = new int[]{4,9,5};
        int[]arr2 = new int[]{9,4,9,4,8};
        int[]result = intersection(arr1,arr2);
        for(int i : result){
            System.out.print(i);
        }
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null){
            return null;
        }
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        int len1 = nums1.length;
        int len2 = nums2.length;

        List<Integer> list = new ArrayList();
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                if(nums1[i] == nums2[j]){
                    if(!list.contains(nums1[i])){
                        list.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int size = list.size();
        int[] arr = new int[size];
        int i = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            arr[i] = it.next();
            i++;
        }
        return arr;
    }
}
