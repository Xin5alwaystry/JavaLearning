package com.MsbJavaTeaching;

import javax.swing.plaf.TableHeaderUI;

/**
 * Created by User on 2018/5/19.
 */
public class TestThread1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        Thread thread = new Thread(myThread);
//        thread.start();
        myThread.start();

        for(int i=1;i<=100;i++) {
            System.out.println("主线程"+i);
        }
    }
}

//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        for(int i=1;i<=100;i++) {
//            System.out.println("子线程"+i);
//        }
//    }
//}

class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=100;i++) {
            System.out.println("子线程"+i);
        }
    }
}


