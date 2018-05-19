package com.MsbJavaTeaching;

import sun.awt.windows.ThemeReader;

/**
 * Created by User on 2018/5/19.
 */
public class DeadLock implements Runnable{
    public int flag;
    static Object o1 = new Object(),o2= new Object();
    @Override
    public void run() {
        System.out.println(flag);
        if(flag==1) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println(1);
                }
            }
        }
        if(flag==0) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println(1);
                }
            }
        }
    }
    public static void main(String[] args) {
        DeadLock deadLock1 = new DeadLock();
        DeadLock deadLock2 = new DeadLock();
        deadLock1.flag=1;
        deadLock2.flag=0;
        Thread t1 = new Thread(deadLock1);
        Thread t2 = new Thread(deadLock2);
        t1.start();
        t2.start();
    }
}
