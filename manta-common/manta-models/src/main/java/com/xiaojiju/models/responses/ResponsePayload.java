package com.xiaojiju.models.responses;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 响应实体
 * 响应类中包含成功、失败两个类型的方法
 * @param <T> 响应实体中包含的指定对象
 * @since 1.0.0-black
 * @author 一块小饼干
 */
public class ResponsePayload<T> implements Serializable {

    /**
     * 响应业务代码
     */
    private int status;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应body
     */
    private T data;

    /**
     * 响应时间
     */
    private String timestamp;

    public ResponsePayload(StatusCode status) {
        this(status.getCode(), status.getDesc());
    }

    public ResponsePayload(int status, String message) {
        this(status, message, null);
    }

    public ResponsePayload(int status, String message, T data) {
        this(status, message, data, makeTime());
    }

    public ResponsePayload(int status, String message, T data, String timestamp) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
    }

    public static <T> ResponsePayload<T> success() {
        return success(ResponseStatusCode.OK);
    }

    public static <T> ResponsePayload<T> success(StatusCode code) {
        return success(code, null);
    }

    public static <T> ResponsePayload<T> success(T t) {
        return success(ResponseStatusCode.OK, t);
    }

    public static <T> ResponsePayload<T> success(StatusCode code, String message) {
        return success(code, message, null);
    }

    public static <T> ResponsePayload<T> success(StatusCode code, T t) {
        return success(code, code.getDesc(), t);
    }

    public static <T> ResponsePayload<T> success(StatusCode code, String message, T t) {
        return new ResponsePayload<>(code.getCode(), code.getDesc(), t, makeTime());
    }

    private static String makeTime() {
        return LocalDateTime.now().toString();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
