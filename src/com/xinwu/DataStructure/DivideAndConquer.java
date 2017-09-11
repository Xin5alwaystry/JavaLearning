package com.xinwu.DataStructure;

/**
 * Created by User on 2017/9/9.
 */
public class DivideAndConquer {
    public static void main(String[] args) {
        int[] arr = {-1,-6};
        DivideAndConquer divideAndConquer = new DivideAndConquer();
        System.out.println(divideAndConquer.maxSubSum(arr));
    }
    private int maxSumRec(int[] a, int left, int right) {
        //base case
        if(left == right) {
            if(a[left] > 0) {
                return a[left];
            } else{
                return 0;
            }
        }

        int center = (left + right)/2;
        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center+1, right);

        int maxLeftBorderSum = 0;
        int leftBorderSum = 0;

        for(int i = center; i>= left; i--) {
            leftBorderSum += a[i];
            if(leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }

        int maxRightBorderSum = 0;
        int rightBorderSum = 0;
        for (int i = center+1; i<=right; i++) {
            rightBorderSum += a[i];
            if(rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }

        return max3(maxLeftSum, maxRightSum, maxLeftSum+maxRightSum);
    }

    private int max3(int a, int b, int c) {
        int max = max2(a,b) > c ? max2(a,b) : c;
        return max;
    }

    private int max2(int a, int b) {
        if(a > b) {
            return a;
        }else{
            return b;
        }
    }

    private int maxSubSum(int[] a) {
        return maxSumRec(a, 0, a.length-1);
    }
}
