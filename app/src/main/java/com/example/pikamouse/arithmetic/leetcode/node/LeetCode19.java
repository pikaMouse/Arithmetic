package com.example.pikamouse.arithmetic.leetcode;

/**
 * create by liting 2018/9/20
 */
public class LeetCode19 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[]args){
        LeetCode19 leetCode19 = new LeetCode19();
        ListNode node1 = leetCode19.new ListNode(0);
//        ListNode node2 = leetCode19.new ListNode(1);
//        ListNode node3= leetCode19.new ListNode(2);
//        ListNode node4 = leetCode19.new ListNode(3);
//        ListNode node5 = leetCode19.new ListNode(4);
//        ListNode node6 = leetCode19.new ListNode(5);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next  = node5;
//        node5.next = node6;
        ListNode h = leetCode19.removeNthFromEnd(node1,1);
        while (h != null){
            System.out.println(h.val);
            h = h.next;
        }

    }

    private   ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        ListNode newHead = head;
        ListNode currL = head;
        ListNode currR = head;
        while (n > 0){
            if (currR.next != null) currR = currR.next;
            n--;
        }
        while (currR.next != null){
            currL = currL.next;
            currR = currR.next;
        }
        if(currL.next != null && currL.next.next != null){
            currL.next = currL.next.next;
        }
        return newHead;

    }

    private ListNode removeNthFromEnd1(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }


}
