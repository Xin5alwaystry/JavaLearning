package com.MsbJavaTeaching;

import javax.print.DocFlavor;
import java.util.Date;

/**
 * Created by User on 2018/5/19.
 */
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread1.flag = false; //这种让线程停止的方法比较粗暴，stop()更加粗暴，已经废弃。
    }
}

class MyThread1 extends Thread {
    boolean flag = true;
    @Override
    public void run() {
        while(flag) {
            System.out.println(new Date());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}