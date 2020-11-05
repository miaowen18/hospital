package com.itgaoshu.hospital.bean;

public class Skull {
    private Integer skullid;

    private String skullname;

    @Override
    public String toString() {
        return "Skull{" +
                "skullid=" + skullid +
                ", skullname='" + skullname + '\'' +
                '}';
    }

    public Integer getSkullid() {
        return skullid;
    }

    public void setSkullid(Integer skullid) {
        this.skullid = skullid;
    }

    public String getSkullname() {
        return skullname;
    }

    public void setSkullname(String skullname) {
        this.skullname = skullname == null ? null : skullname.trim();
    }
}