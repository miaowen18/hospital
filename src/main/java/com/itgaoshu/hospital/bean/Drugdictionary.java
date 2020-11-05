package com.itgaoshu.hospital.bean;

public class Drugdictionary {
    private Integer drugid;

    private String drugname;

    private Integer unitid;
    private String unitName;

    private Double sellingprice;

    private Integer areaid;
    private String areaName;

    private Integer typeid;
    private String typeName;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getAreaName() {
        return areaName;
    }

    @Override
    public String toString() {
        return "Drugdictionary{" +
                "drugid=" + drugid +
                ", drugname='" + drugname + '\'' +
                ", unitid=" + unitid +
                ", unitName='" + unitName + '\'' +
                ", sellingprice=" + sellingprice +
                ", areaid=" + areaid +
                ", areaName='" + areaName + '\'' +
                ", typeid=" + typeid +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public Double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}