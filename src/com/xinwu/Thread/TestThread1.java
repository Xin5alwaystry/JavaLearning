package com.xinwu.Thread;

/**
 * Created by User on 2017/9/10.
 */
public class TestThread1 {
    public static void main(String[] args) {
//        Runner1 runner1 = new Runner1();
//        Thread t = new Thread(runner1);
//        t.start();
        Runner2 runner2 = new Runner2();
        runner2.start();
        for (int i =0; i<1000; i++) {
            System.out.println("Main Thread:-----"+i);
        }
    }
}


//继承父类
class Runner2 extends Thread {
    public void run() {
        for (int i=0; i<1000; i++) {
            System.out.println("runner1:"+i);
        }
    }
}

//实现接口时，在开线程时必须new一个Thread
//class Runner1 implements Runnable {
//    @Override
//    public void run() {
//        for (int i=0; i<1000; i++) {
//            System.out.println("runner1:"+i);
//        }
//    }
//}