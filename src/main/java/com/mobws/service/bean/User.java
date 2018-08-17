package com.mobws.service.bean;

import java.util.Date;

/**
 * @Auther: liujn
 * @Date: 2018/8/17 14:46
 * @Description:
 */
public class User {

    private String cuserid;
    private String user_code;
    private String user_name;
    private Date ts;

    public String getCuserid() {
        return cuserid;
    }

    public void setCuserid(String cuserid) {
        this.cuserid = cuserid;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}
