package com.xinwu.Niuke;

import static java.lang.Math.pow;

/**
 * 题目：给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 算法：
 * 1.全面考察指数的正负、底数是否为零等情况。
 * 2.写出指数的二进制表达，例如13表达为二进制1101。
 * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
 * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
 * TIP：快速幂算法！
 * Created by User on 2017/9/14.
 */
public class Power {
    public static void main(String[] args) {
        System.out.println(solution(2,3));
    }
    public static double solution(double base,int e) {
        double res = 1;
        double curr = base;
        int exponent;
        if (e>0) {
            exponent = e;
        } else if (e<0) {
            if(base==0) {
                throw new RuntimeException("分母不能为零！");
            }
            exponent = -e;
        } else {
            //即指数为0的情况,任何数的零次方都为1。
            return 1;
        }
        while (exponent!=0) {
            if ((exponent&1)==1) {
                res*=curr;
            }
            curr*=curr;
            exponent>>=1;
        }
        return e>=0? res : (1/res);
    }
}
