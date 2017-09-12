package com.xinwu.Niuke;

/**
 * 需要重点理解！！
 *
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
        SolutionOfReConstructBinaryTree solutionForReConstructBinaryTree = new SolutionOfReConstructBinaryTree();
        TreeNode treeNode = solutionForReConstructBinaryTree.reConstructBinaryTree(pre, in);
    }
}
class SolutionOfReConstructBinaryTree {
    public TreeNode reConstructBinaryTree (int[] pre, int[] in) {
        TreeNode treeNode = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        return treeNode;
    }
    private TreeNode reConstructBinaryTree (int [] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        //根据前序遍历序列，找出根。
        TreeNode root = new TreeNode(pre[startPre]);

        for (int i=startIn; i<=endIn; i++) {
            if (in[i]==pre[startPre]) {
                root.left = reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1 );
                root.right = reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
        }
        return root;
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