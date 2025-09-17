package com.back;

public class Rq {
    private String cmd;
    public Rq(String cmd){
        this.cmd = cmd;
    }

    public String getActionName(){

        return cmd.split("\\?")[0];
    }

    public String getParam(String key) {
        return "홍길동";

    }
}
