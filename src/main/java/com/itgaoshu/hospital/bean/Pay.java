package com.itgaoshu.hospital.bean;

import java.util.Date;

public class Pay {
    private Integer payid;

    private Integer registerid;

    private Double money;

    private Date payDate;

    private String userName;

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}