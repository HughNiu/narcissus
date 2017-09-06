package com.red.domain;

/**
 * Created by Niu Qianghong on 2017-09-06 0006.
 */
public class User {
    private Integer userId;
    private String userName; // 用户名
    private String password; // 密码
    private String loginTime; // 登录时间
    private Long createTime; // 创建时间
    private Long updateTime; // 更新时间
    private String loginIP; // 登录的ip

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", loginIP='" + loginIP + '\'' +
                '}';
    }
}
