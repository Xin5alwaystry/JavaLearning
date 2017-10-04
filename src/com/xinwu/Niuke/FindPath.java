package com.xinwu.Niuke;

import java.util.ArrayList;

/**
 * 功能：输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * Created by Xin'5 on 2017/10/3.
 */
public class FindPath {
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> findPath(TreeNode treeNode, int target) {
        //递归的基准情况。
        if (treeNode==null) {
            return listAll;
        }
        //当树不为空树时，任何路径的起始点都是根。
        list.add(treeNode.val);
        target-=treeNode.val;
        if (target==0 && treeNode.left==null && treeNode.right==null) {
            listAll.add(new ArrayList<Integer>(list));
        }
        findPath(treeNode.left,target);
        findPath(treeNode.right,target);
        //下面这行代码要好好理解！
        list.remove(list.size()-1);
        return listAll;
    }
}
