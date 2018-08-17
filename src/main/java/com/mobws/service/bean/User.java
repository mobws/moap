package com.mobws.service.bean;

/**
 * @Auther: liujn
 * @Date: 2018/8/17 14:46
 * @Description:
 */
public class User {

    private String pk_user;
    private String user_name;
    private String user_code;

    public String getPk_user() {
        return pk_user;
    }

    public void setPk_user(String pK_user) {
        this.pk_user = pK_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }
}
