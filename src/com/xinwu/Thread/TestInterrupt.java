package com.xinwu.Thread;

import java.util.Date;

/**
 * Created by User on 2017/9/10.
 */
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            //在哪个线程中调用Thread.sleep,就是让哪个线程休眠
            Thread.sleep(10000);
        } catch (InterruptedException e) { }
        myThread.interrupt();
    }
}

class MyThread extends Thread {
    //通过成员变量来控制线程。
    boolean flag = true;
    public void run() {
        while (flag) {
            System.out.println("==="+new Date()+"===");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
