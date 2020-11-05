package com.itgaoshu.hospital.bean;

public class Area {
    private Integer areaid;

    private String areaname;

    @Override
    public String toString() {
        return "Area{" +
                "areaid=" + areaid +
                ", areaname='" + areaname + '\'' +
                '}';
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }
}