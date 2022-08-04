package com.itheima.config;

public class ResultJson {
    private String status;
    public Object data;

    public ResultJson(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultJson{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
