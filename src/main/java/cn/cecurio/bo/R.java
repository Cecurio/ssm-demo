package cn.cecurio.bo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Cecurio
 * @create: 2017-11-20 21:27
 **/
public class R {
    private Integer code;
    private String msg;
    private Map<String,Object> data;

    public R(Integer code, String msg, Map<String, Object> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R() {
    }

    public Integer getCode() {
        return code;
    }

    public R setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public R setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public R setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public static R ok() {
        return new R(200,"操作成功！");
    }

    public static R serverInternalError() {
        return new R(500,"服务器内部错误！");
    }

    public static R notFound() {
        return new R(404,"404 Not Found！");
    }

    public static R badRequest() {
        return new R(400,"Bad request！");
    }
    public R putData(String key, Object value) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        this.data.put(key,value);
        return this;
    }

}
