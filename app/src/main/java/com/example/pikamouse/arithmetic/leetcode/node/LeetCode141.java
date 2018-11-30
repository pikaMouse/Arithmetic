package com.example.pikamouse.arithmetic.leetcode.node;

/**
 * create by liting 2018/9/24
 */
public class LeetCode141 {


    public static void main(String[]args){
        LeetCode141 leetCode141 = new LeetCode141();
        System.out.print(leetCode141.hasCycle(null));
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }





    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
