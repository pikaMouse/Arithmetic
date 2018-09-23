package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/21
 */
public class LeetCode83 {

    public static void main(String[]args){
        LeetCode83 leetCode24 = new LeetCode83();
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3= new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next  = node5;
        node5.next = node6;
        ListNode h = leetCode24.deleteDuplicates(node1);
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


    private ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head;
        ListNode p = head;
        while (p != null && p.next != null){
            if(p.val == p.next.val){
                ListNode node = p.next.next;
                p.next.next = null;
                p.next = node;
            }else {
                p = p.next;
            }

        }
        return newHead;
    }

}
