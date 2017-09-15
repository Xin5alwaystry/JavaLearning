package com.xinwu.Niuke;

/**
 * 题目：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * Created by User on 2017/9/15.
 */
public class Merge {
    public static void main(String[] args) {

    }
    //递归的方法
    public static ListNode solution(ListNode listNode1,ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        }
        if (listNode2 == null) {
            return listNode1;
        }
        if (listNode1.val <= listNode2.val) {
            listNode1.next = solution(listNode1.next,listNode2);
            return listNode1;
        } else {
            listNode2.next = solution(listNode1,listNode2.next);
            return listNode2;
        }
    }
}
