package com.xinwu.Niuke;

import java.util.Stack;

/**
 * 功能：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * Created by Xin'5 on 2017/10/2.
 */
public class IsPopOrder {
    public boolean solution(int[] push,int[] pop) {
        if (push.length==0 || pop.length==0) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int popIndex = 0;
        for (int i=0; i<push.length; i++) {
            stack.push(push[i]);
            while (!stack.empty() && stack.peek()==pop[i]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
