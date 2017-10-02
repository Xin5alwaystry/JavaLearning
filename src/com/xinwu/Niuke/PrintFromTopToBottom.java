package com.xinwu.Niuke;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 功能：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * Created by Xin'5 on 2017/10/2.
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> solution(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (root == null) {
            return arrayList;
        }
        //借助一个LinkedList,对二叉树进行层次遍历。
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode t = deque.pop();
            arrayList.add(t.val);
            if (t.left != null) {
                deque.add(t.left);
            }
            if (t.right != null) {
                deque.add(t.right);
            }
        }
        return arrayList;
    }
}
