package com.xinwu.Niuke;

/**
 * 功能：将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 学习：StringBuffered 类的使用，常用的charAt,append,insert的方法。
 * Created by User on 2017/9/11.
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer("We are learning Java");
        System.out.println(st.toString());
        System.out.println(solution(st));
    }
    public static String solution(StringBuffer oldStringBuffer) {
        if ( oldStringBuffer == null) {
            return null;
        }
        StringBuffer newStringBuffer = new StringBuffer();
        for (int i = 0; i < oldStringBuffer.length(); i++) {
            //单引号表示单个字符，双引号表示字符串
            if(oldStringBuffer.charAt(i)==' ') {
                newStringBuffer.append('%');
                newStringBuffer.append('2');
                newStringBuffer.append('0');
            } else {
                newStringBuffer.append(oldStringBuffer.charAt(i));
            }
        }
        return newStringBuffer.toString();
    }
}
