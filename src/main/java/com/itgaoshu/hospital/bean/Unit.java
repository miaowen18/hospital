package com.itgaoshu.hospital.bean;

public class Unit {
    private Integer unitid;

    private String unitname;

    @Override
    public String toString() {
        return "Unit{" +
                "unitid=" + unitid +
                ", unitname='" + unitname + '\'' +
                '}';
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }
}