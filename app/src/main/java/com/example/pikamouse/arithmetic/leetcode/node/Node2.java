package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/27
 *
 *
 */
public class Node2 {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[]args){
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3= new ListNode(3);
        node1.next = node2;
        node2.next = node3;





        ListNode h = del(node1,1);
        System.out.print(h.val);
    }

    private static ListNode del(ListNode h,int k){
        if(h == null || k <= 0) return null;
        ListNode l = h;
        ListNode r = h;
        int len = 1;
        int index = k;
        while (r.next != null){
            len++;
            r = r.next;
            k--;
            if (k < 1 && l.next != null){
                l = l.next;
            }

        }
        if(len < index){
            return null;
        }
        return l;

    }
}
