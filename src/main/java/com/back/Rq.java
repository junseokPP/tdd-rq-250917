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

        if(cmd.equals("등록?이름=홍길동")) return "홍길동";
        if(cmd.equals("등록?고향=서울")) return "서울";

        return "홍길동";

    }
}
