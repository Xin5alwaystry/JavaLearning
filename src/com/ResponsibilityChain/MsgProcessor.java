package com.ResponsibilityChain;

/**
 * Created by User on 2018/5/20.
 */
public class MsgProcessor {
    String msg;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        String r = msg.replace('<','[')
                    .replace('>',']');
        return r;
    }
}
