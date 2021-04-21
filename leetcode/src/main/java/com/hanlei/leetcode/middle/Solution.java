package com.hanlei.leetcode.middle;

/**
 * @ClassName Solution
 * @Description 乐扣-中等难度的算法
 * @Author hanlei
 * @Date 2021/1/12 下午8:26
 * @Version 1.0
 */
public class Solution {

    /**
     * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
     * <p>
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     * <p>
     * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * <p>
     * 输入：l1 = [2,4,3], l2 = [5,6,4]
     * 输出：[7,0,8]
     * 解释：342 + 465 = 807.
     * 示例 2：
     * <p>
     * 输入：l1 = [0], l2 = [0]
     * 输出：[0]
     * 示例 3：
     * <p>
     * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * 输出：[8,9,9,9,0,0,0,1]
     */
    private int flag = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        handle(l1, l2);
        if(flag == 1){
            return l1;
        }else {
            return l2;
        }
    }

    public int handle(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            flag = 1;
            int carry = 0;
            carry = (l1.val + l2.val) >= 10 ? (l1.val + l2.val) / 10 : 0;
            l1.val = carry > 0 ? (l1.val + l2.val) - 10 : l1.val + l2.val;
            l2.val = l1.val;
            if (carry != 0) {
                if (l1.next != null) {
                    l1.next.val += carry;
                } else if (l2.next != null) {
                    l2.next.val += carry;
                } else {
                    l1.next = new ListNode(carry);
                }
            }
            handle(l1.next, l2.next);
        } else if (l1 == null && l2 != null) {
            if (l2.val == 10) {
                if (l2.next != null) {
                    l2.next.val += 1;
                } else {
                    l2.next = new ListNode(1);
                }
                l2.val = 0;
            }
            flag = 2;
            handle(null, l2.next);
        } else if (l1 != null && l2 == null) {
            if (l1.val == 10) {
                if (l1.next != null) {
                    l1.next.val += 1;
                } else {
                    l1.next = new ListNode(1);
                }
                l1.val = 0;
            }
            flag = 1;
            handle(l1.next, null);
        }
        return flag;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        //计算2链表之和
        //l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Solution solution = new Solution();
        Solution.ListNode l1 = new Solution.ListNode(9);
        ListNode next1 = new Solution.ListNode(9);
        ListNode next2 = new ListNode(9);
        ListNode next3 = new ListNode(9);
        ListNode next4 = new ListNode(9);
        ListNode next5 = new ListNode(9);
        ListNode next6 = new ListNode(9);
        next5.next = next6;
        next4.next = next5;
        next3.next = next4;
        next2.next = next3;
        next1.next = next2;
        l1.next = next1;
        ListNode l2 = new ListNode(9);
        ListNode next11 = new ListNode(9);
        ListNode next12 = new ListNode(9);
        next11.next = next12;
        l2.next = next11;
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println(result.val);
        while (result.next != null) {
            result = result.next;
            System.out.println(result.val);
        }
    }
}
