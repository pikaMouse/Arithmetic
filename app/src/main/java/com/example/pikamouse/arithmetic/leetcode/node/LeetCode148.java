package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/27
 *
 *
 *
  在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。

 示例 1:

 输入: 4->2->1->3
 输出: 1->2->3->4
 示例 2:

 输入: -1->5->3->4->0
 输出: -1->0->3->4->5

 *
 */
public class LeetCode148 {

    public static void main(String[]args){
        LeetCode148 l = new LeetCode148();
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode.printListNode(l.sortList(node1));
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        // step 3. merge l1 and l2
        return merge(l1, l2);
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }
}
