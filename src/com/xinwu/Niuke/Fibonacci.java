package com.xinwu.Niuke;

/**
 * 功能：输入一个整数n，请你输出斐波那契数列的第n项。
 *
 * Created by User on 2017/9/12.
 */
public class Fibonacci {
    public static void main(String[] args) {
        SolutionOfFibonacci solutionOfFibonacci = new SolutionOfFibonacci();
        for (int i=1; i<=30; i++)
        {
            System.out.println(solutionOfFibonacci.answer2(i));
        }
    }
}

class SolutionOfFibonacci {
    public int answer(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        if(n<0) {
            return 0;
        }else if (n==1 || n==2) {
            return 1;
        }else {
            for(int i=3; i<=n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    //递归方法
    public int answer2(int n) {
        if (n==1 || n==2) {
            return 1;
        } else {
            return answer2(n-1) + answer2(n-2);
        }
    }
}

