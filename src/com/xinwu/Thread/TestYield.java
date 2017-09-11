package com.xinwu.Thread;

/**
 * Created by User on 2017/9/10.
 */
public class TestYield {
    public static void main(String[] args) {
        MyThread3 mt1 = new MyThread3("aa");
        MyThread3 mt2 = new MyThread3("bb");
        mt1.start();
        mt2.start();
    }
}

class MyThread3 extends Thread {
    MyThread3(String s){
        super(s);
    }
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(getName()+":"+i);
            if (i % 10==0) {
                //yield让出CPU时间
                yield();
            }
        }
    }
}
