package com.xinwu.Niuke;

/**
 * 功能：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * Created by Xin'5 on 2017/10/3.
 */
public class VerifySquenceOfBST {
    public static void main(String[] args) {

    }
    public boolean solution(int[] sequence) {
        if (sequence.length==0) {
            return false;
        }
        return isTreeBST(sequence,0,sequence.length-1);
    }
    public boolean isTreeBST(int[] bst, int start, int end) {
        //递归中的基准情况
        if (bst[start] <= bst[end]) {
            return true;
        }
        //当多个循环需要使用同一数据时，考虑将该变量设置为方法中的局部变量。
        int i = start;
        for(; i<bst.length; i++) {
            if (bst[i]>bst[end]) {
                break;
            }
        }
        for (int j=i; j<bst.length; j++) {
            if (bst[j]<bst[end]) {
                return false;
            }
        }
        return isTreeBST(bst,start,i-1) && isTreeBST(bst,i,end-1);
    }
}
