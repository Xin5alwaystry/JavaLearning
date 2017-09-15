package com.xinwu.Thread;

/**
 *功能：实现死锁。
 * 解决死锁问题：
 * 1，将锁的粒度加粗。
 * Created by Xin'5 on 2017/9/15.
 */
public class TestDeadLock extends Thread {
    public int flag = 1;
    static Object o1 = new Object();
    static Object o2 = new Object();
    public void run() {
        System.out.println("flag="+flag);
        if (flag==1) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println("1");
                }
            }
        }
        if (flag==0) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println("0");
                }
            }
        }
    }

    public static void main(String[] args) {
        TestDeadLock testDeadLock1 = new TestDeadLock();
        TestDeadLock testDeadLock2 = new TestDeadLock();
        testDeadLock1.flag = 1;
        testDeadLock2.flag = 0;
        Thread t1 = new Thread(testDeadLock1);
        Thread t2 = new Thread(testDeadLock2);
        t1.start();
        t2.start();
    }
}
