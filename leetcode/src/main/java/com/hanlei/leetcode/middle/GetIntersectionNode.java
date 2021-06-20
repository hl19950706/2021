package com.hanlei.leetcode.middle;

import java.util.Stack;

/**
 * @author hanlei
 */
public class GetIntersectionNode {

    public static void main(String[] args) {
        GetIntersectionNode getIntersectionNode = new GetIntersectionNode();
        //listA = [4,1,8,4,5,5,0,1,8,4,5], listB = [5,0,1,8,4,5,4,1,8,4,5]
        ListNode a = getIntersectionNode.buildListNode(new int[]{4,1,8,4,5});
        ListNode b = getIntersectionNode.buildListNode(new int[]{5,0,1,8,4,5});
        ListNode intersectionNode = getIntersectionNode.getIntersectionNode1(a,b);
        System.out.println(intersectionNode.val);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> a = new Stack<>();
        Stack<ListNode> b = new Stack<>();
        ListNode tail = headA;
        while (tail != null){
            a.push(tail);
            tail = tail.next;
        }
        tail = headB;
        while (tail != null){
            b.push(tail);
            tail = tail.next;
        }
        ListNode res = null;
        while (!(a.empty() && b.empty()) && a.peek().val == b.peek().val){
            b.pop();
            res = a.pop();
        }
        return res;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    public ListNode buildListNode(int[] ints){
        ListNode head = new ListNode(0);
        ListNode tail,pre = head ;
        for (int anInt : ints) {
            tail = new ListNode(anInt);
            pre.next = tail;
            pre = tail;
        }
        return head.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
