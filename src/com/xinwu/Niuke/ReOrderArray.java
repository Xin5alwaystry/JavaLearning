package com.xinwu.Niuke;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 2017/9/14.
 */
public class ReOrderArray {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        for (int i : solution2(arr)) {
            System.out.print(i+" ");
        }
    }

    //Amazing!! 只有遇到前一个位置的数为偶数，且后一个位置的数为奇数时，交换二者。
    public static int[] solution2(int[] array) {
        for(int i= 0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        return array;
    }

    //自己写的最笨的方法，占用内存太大。
    public static int[] solution(int[] arrOld) {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        int[] arrNew = new int[arrOld.length];
        for(int i=0; i<arrOld.length; i++) {
            if (arrOld[i]%2!=0) {
                list1.add(arrOld[i]);
            } else {
                list2.add(arrOld[i]);
            }
        }
        for (int i=0; i<list1.size(); i++) {
            arrNew[i] = list1.get(i);
        }
        for (int i=0; i<list2.size(); i++) {
            arrNew[list1.size()+i]=list2.get(i);
        }
        return arrNew;
    }
}
