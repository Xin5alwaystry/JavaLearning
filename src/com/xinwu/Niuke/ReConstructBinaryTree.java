package com.xinwu.Niuke;

/**
 * 功能：重建二叉树
 *
 * Created by Xin'5 on 2017/9/12.
 */
public class ReConstructBinaryTree {
    public static void main (String[] args) {
        //前（根）序遍历
        int[] pre = {1,2,4,7,3,5,6,8};
        //中（根）序遍历
        int[] in = {4,7,2,1,5,3,8,6};
    }
}
class SolutionForReConstructBinaryTree {
    public TreeNode reConstructBinaryTree (int[] pre, int[] in) {
        TreeNode treeNode = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        return treeNode;
    }
    private TreeNode reConstructBinaryTree (int [] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

    }
}

//Definition for Binary Tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}