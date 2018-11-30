package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/27
 *
 *
 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…

 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 示例 1:

 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 示例 2:

 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 *
 */
public class LeetCode143 {


    public static void main(String[]args){
        ListNode h1 = ListNode.createListNode(1,2,3,4);
        new LeetCode143().reorderList1(h1);
    }

    public void reorderList(ListNode head) {
        if(head == null) return ;
        if(head.next == null) return ;
        ListNode l = head;
        ListNode m = head;
        ListNode r = head;
        while(l.next != null){

            while(r.next != null){
                m = r;
                r = r.next;
            }
            if(l.next == r) break;
            m.next = null;
            ListNode node = l.next;
            l.next = null;
            l.next = r;
            r.next = node;
            l = node;
            r = l;
        }

        ListNode.printListNode(head);



    }

    public void reorderList1(ListNode head) {
        // divide the list, reverse 2 nd list voila
        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;    // marking the end of first sublist.
        ListNode newList = revList(slow);
        ListNode tmp = head;
        while(tmp != null && newList != null){
            ListNode tmpNext = tmp.next;
            ListNode newListNext = newList.next;
            tmp.next = newList;
            if(tmpNext != null)
                newList.next = tmpNext;
            tmp = tmpNext;
            newList = newListNext;
        }
    }
    public ListNode revList(ListNode l){
        ListNode tmp = l;
        ListNode prev = null;
        ListNode nextNode = null;
        while(tmp != null){
            nextNode = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = nextNode;
        }
        return prev;
    }
}
