package com.example.pikamouse.arithmetic.leetcode.node;

import java.util.List;

/**
 * create by liting 2018/9/14
 */
public class LeetCode21 {

    public static void main(String[]args){
        LeetCode21 leetCode21 = new LeetCode21();
        ListNode listNode1 = leetCode21.new ListNode(3);
        ListNode listNode2 = leetCode21.new ListNode(4);
        ListNode listNode3 = leetCode21.new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = leetCode21.new ListNode(0);
        ListNode listNode5 = leetCode21.new ListNode(1);
        ListNode listNode6 = leetCode21.new ListNode(2);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode node = leetCode21.merge1(listNode1,listNode4);
        while (node != null){
            System.out.print(node.val);
            node = node.next;
        }
    }

    private ListNode merge2(ListNode l1,ListNode l2){
        if(l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode p = newHead;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }else {
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }
        if(l1 != null) p.next = l1;
        if(l2 != null) p.next = l2;

        return newHead.next;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    /**
     * 我的答案
     * 已解决
     * @param l1
     * @param l2
     * @return
     */
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

    /**
     * 我的答案
     * 已解决
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1,ListNode l2){
        if(l1 == null || l2 == null){    //注意这个边界条件
            return l1 == null ? l2 : l1;
        }
        ListNode currL1 = l1;
        ListNode currL2 = l2;
        ListNode head = l1;      //head是用来返回的
        //第一种情况，链表2都是小于链表1
        while(currL1 != null && currL2 != null && currL2.val < currL1.val){
            ListNode newCurrL2 = currL2.next;
            currL2.next = head;
            head = currL2;
            currL1 = head;
            currL2 = newCurrL2;
        }
        //其他情况
        while(currL1 != null && currL2!= null){
            //判断插入位置
            while (currL1.next != null && currL1.next.val <= currL2.val){
                currL1 = currL1.next;

            }
            if(currL1.next == null && currL2.next != null){
                currL1.next = currL2;
                return head;
            }else {
                ListNode newCurrL2 = currL2.next;
                ListNode nodeToInsert = currL2;
                nodeToInsert.next = currL1.next;
                currL1.next = nodeToInsert;
                currL2 = newCurrL2;
                currL1 = currL1.next;
            }
        }


        return head;
    }

    private static ListNode merge1(ListNode l1,ListNode l2){
        if(l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }
        ListNode h = new LeetCode21().new ListNode(0);
        ListNode p = h;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null){
            p.next = l1;
        }
        if (l2 != null){
            p.next = l2;
        }
        return h.next;
    }


}
