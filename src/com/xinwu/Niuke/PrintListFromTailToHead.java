package com.xinwu.Niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 功能：输入一个链表，从尾到头打印链表每个节点的值。
 * 算法思路：利用stack先进后出的特点，先把List中的值一次推入stack中，然后再将stack中的值依次推出List。
 * Created by Xin'5 on 2017/9/11.
 */
public class PrintListFromTailToHead {
    public static void main(String[] args) {

    }
}
class SolutionOfPrintListFromTailToHead {
    public List<Integer> printListFromTailToHead (ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        List<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}

//列表节点类
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
