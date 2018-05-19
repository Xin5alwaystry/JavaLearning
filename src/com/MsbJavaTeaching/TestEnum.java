package com.MsbJavaTeaching;

/**
 * Created by User on 2018/5/17.
 */
public class TestEnum {
    public enum MyColor {Red,Green,Blue};
    public static void main(String[] args){
        MyColor mc = MyColor.Red;
        switch(mc){
            case Red:
                System.out.println("red");
                break;
            case Blue:
                System.out.println("blue");
                break;
            case Green:
                System.out.println("green");
        }
        System.out.println(mc);
    }
}
