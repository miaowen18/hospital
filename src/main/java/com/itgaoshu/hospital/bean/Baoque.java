package com.itgaoshu.hospital.bean;

public class Baoque {
    private Integer baoqueid;

    private String baoquename;

    private Integer baoquenum;

    @Override
    public String toString() {
        return "Baoque{" +
                "baoqueid=" + baoqueid +
                ", baoquename='" + baoquename + '\'' +
                ", baoquenum=" + baoquenum +
                '}';
    }

    public Integer getBaoqueid() {
        return baoqueid;
    }

    public void setBaoqueid(Integer baoqueid) {
        this.baoqueid = baoqueid;
    }

    public String getBaoquename() {
        return baoquename;
    }

    public void setBaoquename(String baoquename) {
        this.baoquename = baoquename == null ? null : baoquename.trim();
    }

    public Integer getBaoquenum() {
        return baoquenum;
    }

    public void setBaoquenum(Integer baoquenum) {
        this.baoquenum = baoquenum;
    }
}