package com.xinwu.Niuke;

import java.util.Scanner;

/**
 * 题目：我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 思路：实际上仍然是斐波那契数列，在考虑递归求解的时候，需要具体的列出前几种情况，进而找到递归的规律。
 * Created by User on 2017/9/14.
 */
public class RectCover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        if (n<=1) {
            return 1;
        } else if (n==2) {
            return 2;
        } else {
            return solution(n-1)+solution(n-2);
        }
    }
}
