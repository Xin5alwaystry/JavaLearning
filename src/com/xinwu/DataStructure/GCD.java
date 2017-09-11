package com.xinwu.DataStructure;

/**
 * Created by User on 2017/9/9.
 */
public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.gcd1(1989,1989));
    }

    private long gcd1(long a, long b) {
        long temp = 0;
        if(a<b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
