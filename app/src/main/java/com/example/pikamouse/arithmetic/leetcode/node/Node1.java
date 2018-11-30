package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/27
 *
 * 链表两个数相加
 */
public class Node1 {



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



        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(6);
        node4.next  = node5;
        node5.next = node6;

        ListNode h = add(node1,node4);
        while (h != null){
            System.out.println(h.val);
            h = h.next;
        }
    }


    private static ListNode add(ListNode l1,ListNode l2){
        if(l1 == null || l2 == null){
           return l1 == null ? l2 : l1;
        }
        ListNode newHead = new ListNode(0);

        ListNode p = l1;
        ListNode q = l2;
        ListNode r = newHead;
        int result = 0;
        int shi = 0;
        int ge = 0;
        while (p != null || q != null){
            int a = p == null ? 0 : p.val;
            int b = q == null ? 0 : q.val;
            result = a + b + shi;
            ge = result % 10;
            shi = result / 10;
            r.next = new ListNode(ge);
            r = r.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(shi != 0){
            r.next = new ListNode(shi);
        }
        return newHead.next;
    }
}
