package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/20
 */
public class LeetCode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[]args){
        LeetCode leetCode = new LeetCode();
        ListNode node1 = leetCode.new ListNode(0);
        ListNode node2 = leetCode.new ListNode(1);
        ListNode node3= leetCode.new ListNode(2);
        ListNode node4 = leetCode.new ListNode(3);
        ListNode node5 = leetCode.new ListNode(4);
        ListNode node6 = leetCode.new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next  = node5;
        node5.next = node6;
        ListNode h = leetCode.reverse(node1);
        while (h != null){
            System.out.println(h.val);
            h = h.next;
        }

    }

    private ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode cru = head;
        while (cru != null){
            ListNode node = cru.next;
            cru.next = pre;
            pre = cru;
            cru = node;
        }
        return pre;
    }

}
