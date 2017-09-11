package com.xinwu.Niuke;

/**
 * 功能：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 学习：二维数组的初始化。
 * Created by User on 2017/9/11.
 */
public class FindNumberInArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int target = 9;
        System.out.println(find(arr,target));
    }
    public static boolean find(int[][] arr,int a) {
        //算法思想：从二维数组的最后一行开始扫描。当遇到
        int len = arr.length-1;
        int i = 0;
        while ((len>0)&&(i<arr[0].length)) {
            if (arr[len][i] > a) {
                len --;
            } else if (arr[len][i] < a) {
                i ++;
            } else {
                return true;
            }
        }
        return false;
    }
}
