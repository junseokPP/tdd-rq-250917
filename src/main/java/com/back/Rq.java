package com.back;

public class Rq {

    private String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }


    public String getActionName() {

        return cmd.split("\\?")[0];
    }

    public String getParam(String inputKey, String defaultValue) {

        String[] cmdBits = cmd.split("\\?");
        String queryString = cmdBits[1];
        String[] queryBits = queryString.split("&");

        for(String param : queryBits) {
            String[] paramBits = param.split("=");
            String key = paramBits[0];
            String value = paramBits[1];

            if(inputKey.equals(key)) {
                return value;
            }
        }

        return defaultValue;
    }
}