package com.hanlei.leetcode.middle;

/**
 * @ClassName Solution1
 * @Description
 * @Author hanlei
 * @Date 2021/4/6 下午10:23
 * @Version 1.0
 */

import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Solution1 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(7);
        ListNode listNode7 = new ListNode(8);
        ListNode listNode8 = new ListNode(9);
        listNode7.next = listNode8;
        listNode6.next = listNode7;
        listNode5.next = listNode6;
        listNode4.next = listNode5;
        listNode3.next = listNode4;
        listNode2.next = listNode3;
        listNode1.next = listNode2;
        listNode.next = listNode1;

        ListNode listNode9 = new Solution1().reverseKGroup(listNode, 3);
        System.out.println("");
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        int length = 0;
        ListNode pre = res,
                cur = head,
                temp = null;
        while (head != null) {
            length++;
            head = head.next;
        }
        //分段使用头插法将链表反序
        for (int i = 0; i < length / k; i++) {
            //pre作为每一小段链表的头节点，负责衔接
            for (int j = 1; j < k; j++) {
                temp = cur.next;
                cur.next = temp.next;
                //相当于头插法，注意：
                //temp.next = cur是错误的，temp需要连接的不是前一节点，而是子序列的头节点
                temp.next = pre.next;
                pre.next = temp;
            }
            //每个子序列反序完成后，pre，cur需要更新至下一子序列的头部
            pre = cur;
            cur = cur.next;
        }
        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int i) {
        this.val = i;
    }
}
