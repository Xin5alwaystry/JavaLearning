package com.ThinkingInJava;

/**
 * 功能：
 * Write a class named Outer containing an
 * inner class named Inner. Add a method to Outer
 * that returns an object of type Inner. In
 * main(), create and initialize a reference to
 * an Inner.
 * Created by User on 2017/9/17.
 */
public class OuterClass {
    private class InnerClass {
        public InnerClass() {
            System.out.println("I am InnerClass!");
        }
    }

    public InnerClass getInnerClass() {
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.getInnerClass();
    }
}
