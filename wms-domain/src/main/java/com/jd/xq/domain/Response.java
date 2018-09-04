package com.jd.xq.domain;

/**
 * Package: com.jd.xq.domain
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/7/6
 * Time: 17:04
 * Description:
 */
public class Response<T>{
    private int code;
    private String msg;
    private T data;

    public Response() {
    }

    public Response(int code, String msg, T data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static Response from(int code) {
        return new Response(code, null, null);
    }

    public static <R> Response<R> from(int code, String msg, R data) {
        return new Response(code, msg, data);
    }

    public static Response from(int code, String msg) {
        return new Response(code, msg, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
