package com.xinwu.Thread;

/**
 * Created by User on 2017/9/10.
 */
public class TestJoin {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2("Tom");
        myThread2.start();
        try {
            //join 将调用该方法的线程合并到主线程中。
            myThread2.join();
        } catch (InterruptedException e) { }
        for (int i=0; i<=10; i++) {
            System.out.println("I am main Thread!");
        }
    }
}
class MyThread2 extends Thread {
    //给线程起名字
    MyThread2(String s){
        super(s);
    }
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am"+getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}