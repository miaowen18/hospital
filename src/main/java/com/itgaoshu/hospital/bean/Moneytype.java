package com.itgaoshu.hospital.bean;

public class Moneytype {
    private Integer moneyid;

    private String moneytype;

    private String percent;

    public Integer getMoneyid() {
        return moneyid;
    }

    public void setMoneyid(Integer moneyid) {
        this.moneyid = moneyid;
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype == null ? null : moneytype.trim();
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent == null ? null : percent.trim();
    }
}