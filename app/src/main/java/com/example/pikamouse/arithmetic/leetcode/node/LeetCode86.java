package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/20
 *
 *
 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。

 你应当保留两个分区中每个节点的初始相对位置。

 示例:

 输入: head = 1->4->3->2->5->2, x = 3
 输出: 1->2->2->4->3->5

 *
 */
public class LeetCode86 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[]args){
        LeetCode86 leetCode19 = new LeetCode86();
        ListNode node1 = leetCode19.new ListNode(3);
        ListNode node2 = leetCode19.new ListNode(1);
        ListNode node3 = leetCode19.new ListNode(2);
//        ListNode node4 = leetCode19.new ListNode(2);
//        ListNode node5 = leetCode19.new ListNode(5);
//        ListNode node6 = leetCode19.new ListNode(2);
        node1.next = node2;
        node2.next = node3;
//        node3.next = node4;
//        node4.next  = node5;
//        node5.next = node6;
        ListNode h = leetCode19.partition(node1,3);
        while (h != null){
            System.out.println(h.val);
            h = h.next;
        }

    }

    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode left = head;
        ListNode leftPre = newHead;
        while (left != null && left.val < x){
            leftPre = leftPre.next;
            left = left.next;
        }
        if(left == null){
            return newHead.next;
        }
        ListNode rightPre = leftPre;
        ListNode right = left;

        while(right != null ){
            if(right.val < x){
                ListNode node = right.next;
                leftPre.next = right;
                right.next = left;
                rightPre.next = node;
                leftPre = right;
                right = node;
            }else{
                if(rightPre != null) rightPre = rightPre.next;
                if(right != null) right = right.next;
            }

        }
        return newHead.next;
    }


}
