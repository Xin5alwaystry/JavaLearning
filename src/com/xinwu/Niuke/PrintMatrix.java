package com.xinwu.Niuke;

import java.util.LinkedList;

/**
 * 功能：
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * Created by User on 2017/9/21.
 */
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        LinkedList<Integer> outputList = new LinkedList<Integer>();
        printMatrixClockWisely(input,0,0, input.length-1, input[0].length-1, outputList);
        for (int i : outputList) {
            System.out.print(i+" ");
        }
    }
    public static void printMatrixClockWisely(int[][] matrix, int startRow, int startCol, int endRow, int endCol, LinkedList<Integer> result) {
        if (startRow<endRow && startCol<endCol) {
            //第一行向右遍历
            for (int i=startCol; i<=endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            //最后一列向下遍历
            for (int j=startRow+1; j<=endRow; j++) {
                result.add(matrix[j][endCol]);
            }
            //最后一行向左遍历
            for (int k=endCol-1; k>=startCol; k--) {
                result.add(matrix[endRow][k]);
            }
            for (int w=endRow-1; w>=startRow+1; w--) {
                result.add(matrix[w][startCol]);
            }
            printMatrixClockWisely(matrix, startRow+1, startCol+1, endRow-1, endCol-1, result);
        } else if (startCol<endCol && startRow==endRow) {
            for (int i= startCol; i<=endCol; i++) {
                result.add(matrix[startRow][i]);
            }
        } else if (startCol==endCol && startRow<endRow) {
            for (int j= startRow; j<endRow; j++) {
                result.add(matrix[j][startCol]);
            }
        } else if (startRow==endRow && startCol==endCol) {
            result.add(matrix[startRow][startCol]);
        } else {
            return ;
        }
    }

}
