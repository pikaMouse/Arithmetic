package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/20
 */
public class LeetCode19 {



    public static void main(String[]args){
        LeetCode19 leetCode19 = new LeetCode19();
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
        //避免只有一个结点时，删除一个结点的报错,必须加多一个结点
        ListNode node = new ListNode(-1);
        ListNode newHead = node;
        node.next = head;
        ListNode currL = newHead;
        ListNode currR = newHead;
        for(int i = 0; i < n;i++){
            currR = currR.next;
        }
        //移到最后的结点，所以是currR.next
        while (currR.next != null){
            currL = currL.next;
            currR = currR.next;
        }
        currL.next = currL.next.next;

        return newHead.next;

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
