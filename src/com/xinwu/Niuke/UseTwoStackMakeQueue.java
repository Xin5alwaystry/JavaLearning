package com.xinwu.Niuke;

import java.util.Stack;

/**
 * 算法:利用stack先进后出的特点，先将数装入stack1中，
 * 而后再讲stack1中的数推出并以此转入stack2中，就达到了正序的效果，进而实现Quene。
 * Created by User on 2017/9/12.
 */
public class UseTwoStackMakeQueue {
    public static void main (String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        SolutonUseTwoStackMakeQueue solutonUseTwoStackMakeQueue = new SolutonUseTwoStackMakeQueue(stack1,stack2);
        solutonUseTwoStackMakeQueue.push(1);
        solutonUseTwoStackMakeQueue.push(2);
        solutonUseTwoStackMakeQueue.push(3);
        solutonUseTwoStackMakeQueue.pop();
    }
}
class SolutonUseTwoStackMakeQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public SolutonUseTwoStackMakeQueue(Stack<Integer> stack1, Stack<Integer> stack2) {
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    public void push(int node) {
        stack1.push(node);
    }

    public int size() {
        return stack1.size();
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Quene is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
