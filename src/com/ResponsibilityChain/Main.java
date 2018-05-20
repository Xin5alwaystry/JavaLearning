package com.ResponsibilityChain;

/**
 * Created by User on 2018/5/20.
 */
public class Main {
    public static void main(String[] args) {
        String msg = "大家好:) <script> 敏感";
        MsgProcessor msgProcessor = new MsgProcessor();
        msgProcessor.setMsg(msg);
        System.out.println(msgProcessor.process());
    }
}
