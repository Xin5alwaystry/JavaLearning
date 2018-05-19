package com.MsbJavaTeaching;

import sun.awt.windows.ThemeReader;

/**
 * Created by User on 2018/5/19.
 */
public class TestSync implements Runnable{
    Timer timer = new Timer();
    public static void main(String[] args) {
        TestSync testSync = new TestSync();
        Thread t1 = new Thread(testSync);
        Thread t2 = new Thread(testSync);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    public void run(){
        timer.add(Thread.currentThread().getName());
    }
}

class Timer {
    public static int num = 0;
    // 此处synchronized表示，在执行该方法的过程中，当前对象被锁定。
    public synchronized void add(String name) {
        num++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"你是第"+num+"个使用timer的线程");
    }
}
