package com.lingbang.entity.base;

import org.springframework.stereotype.Component;

/**
 * 网络状态
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/5/4
 * Email:   linxianqinwork@qq.com
 */
@Component
public class NetState {
    public static final int SUCCESS = 200;// 链接成功
    public static final int DATA_NOT_FOUND = 300;// 数据库未找到数据
    public static final int PARAMS_ERROR = 400;// 客户端参数错误
    public static final int SERVER_ERROR = 500;// 服务端异常
    private String data;// 网络状态
    private int errorCode;// 网络状态码
    private Object Json;
    private String info;    //信息
    private boolean success = true;    //信息

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getJson() {
        return Json;
    }

    public void setJson(Object json) {
        Json = json;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "NetState{" +
                "data='" + data + '\'' +
                ", errorCode=" + errorCode +
                ", Json=" + Json +
                ", info='" + info + '\'' +
                ", success=" + success +
                '}';
    }

}
