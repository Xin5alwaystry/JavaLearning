package com.xinwu.Thread;

/**
 * 问题描述：模拟生产和消费馒头的过程。
 * Created by Xin'5 on 2017/9/19.
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        SyncStack ss = new SyncStack();
        Producer p = new Producer(ss);
        Consumer c = new Consumer(ss);
        new Thread(p).start();
        new Thread(c).start();
    }
}

//
class ManTou {
    int id;
    ManTou(int id) {
        this.id = id;
    }
    public String toString() {
        return "ManTou:"+ id;
    }
}

//装馒头的篮子满足先进后出，类似栈。
class SyncStack {
    int idx = 0;
    ManTou[] manTous = new ManTou[6];

    //生产者放入馒头push方法
    public synchronized void push(ManTou manTou) {
        while (idx == manTous.length) {
            //此处的wait方法是object类中的方法，此处表达的意思是当前调用本方法的线程wait！
            //只有锁住（synchronized时）才能够wait。
            //wait后，对象的锁不再归我所有，二sleep方法睡过去的时候，仍然拥有锁。
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //叫醒在wait在当前对象上的线程。一般和wait一一对应
        this.notify();
        manTous[idx] = manTou;
        idx ++;
    }
    public synchronized ManTou pop() {
        while (idx == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        idx --;
        return manTous[idx];
    }
}

class Producer implements Runnable {
    //生产者需要有篮子的引用。
    SyncStack ss = null;

    Producer(SyncStack ss) {
        this.ss = ss;
    }
    @Override
    public void run() {
        for (int i=0; i<20; i++) {
            ManTou manTou = new ManTou(i);
            ss.push(manTou);
            System.out.println("生成了：" + manTou);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    //生产者需要有篮子的引用。
    SyncStack ss = null;

    Consumer(SyncStack ss) {
        this.ss = ss;
    }
    @Override
    public void run() {
        for (int i=0; i<20; i++) {
            ManTou manTou = ss.pop();
            System.out.println("生成了：" + manTou);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}