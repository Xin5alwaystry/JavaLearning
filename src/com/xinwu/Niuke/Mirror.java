package com.xinwu.Niuke;

import java.util.Stack;

/**
 * 功能：操作给定的二叉树，将其变换为源二叉树的镜像。
 * Created by User on 2017/9/21.
 */
public class Mirror {
    public static void main(String[] args) {

    }
    public static void solution(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        treeNodeStack.push(root);
        while (!treeNodeStack.empty()) {
            TreeNode treeNode = treeNodeStack.pop();
            if (treeNode.left!=null || treeNode.right!=null) {
                TreeNode treeNodeLeft = treeNode.left;
                TreeNode treeNodeRight = treeNode.right;
                treeNode.left = treeNodeRight;
                treeNode.right = treeNodeLeft;
            }
            if (treeNode.left != null) {
                //此前，treeNodeStack为空；push进非空元素后，不为空，因此仍然在循环体中，巧妙的“递归”！
                treeNodeStack.push(treeNode.left);
            }
            if (treeNode.right != null) {
                treeNodeStack.push(treeNode.right);
            }
        }
    }
}
