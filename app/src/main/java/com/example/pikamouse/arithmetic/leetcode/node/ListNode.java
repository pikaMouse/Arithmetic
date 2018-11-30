package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/27
 */
public class ListNode {
    private static int index = 0;

    int val;
    ListNode next;
    ListNode(int x) { val = x; }


    public static void printListNode(ListNode h){
        while (h != null){
            System.out.print(h.val + "  ");
            h = h.next;
        }
    }

    public static ListNode createListNode(int ... a){
        int[]arr = a;
        int len = arr.length;
        ListNode h = new ListNode(arr[0]);
        ListNode p = h;
        for(int i = 1; i < len; i++){
            ListNode node = new ListNode(arr[i]);
            p.next = node;
            p = p.next;

        }
        return h;

    }


}
