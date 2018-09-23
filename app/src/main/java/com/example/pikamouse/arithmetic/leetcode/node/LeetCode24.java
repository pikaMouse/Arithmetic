package com.example.pikamouse.arithmetic.leetcode.node;

import java.util.List;

/**
 * create by liting 2018/9/21
 */
public class LeetCode24 {

    public static void main(String[]args){
        LeetCode24 leetCode24 = new LeetCode24();
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3= new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next  = node5;
        node5.next = node6;
        ListNode h = leetCode24.swapPairs(node1);
        while (h != null){
            System.out.println(h.val);
            h = h.next;
        }

    }



    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    private ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode pre = newHead;
        ListNode cur = head;
        //双数的才能反转
        while (cur != null && cur.next != null) {
            pre.next = cur.next;

            cur.next = cur.next.next;
            pre.next.next = cur;

            pre = cur;
            cur = pre.next;
        }
        return newHead.next;
    }

}
