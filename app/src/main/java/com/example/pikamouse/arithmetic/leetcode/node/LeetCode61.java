package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/27
 */
public class LeetCode61 {


    public static void main(String[]args){
        LeetCode61 leetCode61 = new LeetCode61();
//        ListNode listNode1 = leetCode61.new ListNode(0);
        ListNode listNode2 = leetCode61.new ListNode(1);
        ListNode listNode3 = leetCode61.new ListNode(2);
        //listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode head = leetCode61.rotateRight1(listNode2,2);
        while (head!= null){
            System.out.print(head.val);
            head = head.next;
        }

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode l = head;
        int len = 1;
        while (l.next != null){
            len++;
            l = l.next;
        }
        int index = k;
        while(index > len){
            index = index - len;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode left = newHead;
        ListNode right = newHead;
        while (index > 0){
            right = right.next;
            index--;
        }
        while (right.next != null){
            left = left.next;
            right = right.next;
        }
        l.next = head;
        head = left.next;
        if(l.next == head) l.next = null;
        left.next = null;
        return head;
    }
    public ListNode rotateRight1(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode tail = head;
        int length = 1;
        while(tail.next!=null){
            tail = tail.next;
            length ++;
        }
        tail.next = head;
        k %=length;
        for(int i = 0; i<(length - k -1);i++)
            head = head.next;
        tail = head;
        head = head.next;
        tail.next = null;

        return head;
    }
}
