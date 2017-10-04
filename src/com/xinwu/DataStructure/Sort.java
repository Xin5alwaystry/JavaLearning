package com.xinwu.DataStructure;

/**
 * Created by Xin'5 on 2017/10/3.
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {12,35,8,9};
        //insertSort(arr);
        //shellSort1(arr);
        //mergeSort(arr);
        bubbleSort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //插入排序。稳定。
    private static void insertSort(int[] beforeSort) {
        int j;
        //i从1开始，因此当数组只有一个元素时，可以认为是已经排好序的。
        for (int i=1; i<beforeSort.length; i++) {
            int tmp = beforeSort[i];
            for (j=i; j>0 && tmp<beforeSort[j-1]; j--) {
                beforeSort[j] = beforeSort[j-1];
            }
            //交换完j和j-1后，j会自减，因此下面的赋值语句实际上是把原先j位置上的元素值给了j-1位置上的元素值。
            beforeSort[j] = tmp;
        }
    }

    //希尔排序，不稳定。
    //使用shell建议系列的序列。此处循环条件的选择很重要！
    private static void shellSort1(int[] arr) {
        int j;
        for (int gap=arr.length/2; gap>0; gap/=2) {
            for (int i=gap; i<arr.length; i++) {
                int tmp = arr[i];
                for (j=i; j>=gap && arr[j]<arr[j-gap]; j-=gap) {
                    arr[j] = arr[j-gap];
                }
                arr[j] = tmp;
            }
        }
    }

    //堆排序.不稳定。

    //冒泡排序
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    //归并排序。稳定
    private static void mergeSort(int[] a, int[] tmpArr, int left, int right) {
        if (left < right) {
            int center = (left + right)/2;
            mergeSort(a ,tmpArr, left, center);
            mergeSort(a, tmpArr, center+1, right);
            merge(a, tmpArr, left, center+1, right);
        }
    }
    public static void mergeSort(int[] a) {
        int[] tmpArr =new int[a.length];

        mergeSort(a, tmpArr, 0, a.length-1);
    }
    private static void merge(int[] a, int[] tmpArr, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos-1;
        int tmpPos = leftPos;
        int numElements = rightEnd-leftPos+1;

        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos] <= a[rightPos]) {
                tmpArr[tmpPos++] = a[leftPos++];
            }else {
                tmpArr[tmpPos++] = a[rightPos++];
            }
        }

        while (leftPos <= leftEnd) {
            tmpArr[tmpPos++] = a[leftPos++];
        }

        while (rightPos <= rightEnd) {
            tmpArr[tmpPos++] = a[rightPos++];
        }

        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArr[rightEnd];
        }
    }

    //要传入数组，才能够真正交换数组元素。
    private static void swap(int[] arr,int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
