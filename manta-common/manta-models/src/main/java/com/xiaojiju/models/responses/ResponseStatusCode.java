package com.xiaojiju.models.responses;

/**
 *
 */
public enum ResponseStatusCode implements StatusCode {
    OK(200, "OK"),
    SERVER_ERROR(500, "Internal Server Error"),
    BAD_GATEWAY(504, "Bad Gateway");

    private int code;
    private String desc;

    ResponseStatusCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public int getCode() {
        return code;
    }
}
