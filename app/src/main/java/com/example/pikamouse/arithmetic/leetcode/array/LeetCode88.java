package com.example.pikamouse.arithmetic.leetcode.array;

/**
 * create by liting 2018/9/14
 */
public class LeetCode88 {

    public static void main(String[]args){
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge1(nums1,0,nums2,1);
    }

    /**
     * 别人的答案
     * 已解决
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >=0 && j >= 0) {
            if(nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
        while(j >= 0) nums1[k--] = nums2[j--];
    }

    /**
     * 我的答案
     * 未解决
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeNum;
        if(nums1 == null || nums2 == null){
            return;
        }
            if (m == 0) {
                mergeNum = nums2;
                return;
            } else if(n == 0){
                mergeNum = nums1;
                return;
            }

        int[]minNum = nums1.length > nums2.length ? nums2 : nums1;
        mergeNum = nums1.length > nums2.length ? nums1: nums2;

        int p = 0;
        int q = 0;
        int merLen = mergeNum.length;
        int minLen = minNum.length;

        while(q < minLen){
            if(minNum[q] <= mergeNum[p]){
                rightMove(mergeNum,p,merLen - 1);
                mergeNum[p] = minNum[q];
                q++;
                p++;
            }else {

                if(mergeNum[p] == 0){
                    mergeNum[p] = minNum[q];
                    q++;
                }
                p++;



            }

        }

        for(int i : mergeNum){
            System.out.print(i);
        }

    }

    private static void rightMove(int[]arr,int p,int len){
        while (len > p){
            swap(arr,len,len - 1);
            len--;
        }
    }

    private static void swap(int[]arr,int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
