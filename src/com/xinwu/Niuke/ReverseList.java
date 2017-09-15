package com.xinwu.Niuke;

/**
 * 题目：输入一个链表，反转链表后，输出链表的所有元素。
 * 思路：需要好好消化！
 * Created by Xin'5 on 2017/9/14.
 */
public class ReverseList {
    public static void main(String[] args) {

    }

    public static ListNode solution(ListNode head) {
        ListNode newHead = null;
        ListNode currentHead = head;
        ListNode pre = null;
        if (currentHead == null) {
            return null;
        }
        while (currentHead!=null) {
            if (currentHead.next==null) {
                newHead = currentHead;
            }
            currentHead.next = pre;
            pre = currentHead;
            currentHead = currentHead.next;
        }
        return newHead;
    }


    public static ListNode solution2(ListNode head) {
        if(head==null) {
            return null;
        }
        ListNode reversedHead = null;
        ListNode current = head;
        ListNode tmp = null;
        ListNode pre = null;
        while(current!=null){
            tmp=current.next;
            current.next=pre;
            if(tmp==null)
                reversedHead=current;
            pre=current;
            current=tmp;

        }
        return reversedHead;
    }
}
