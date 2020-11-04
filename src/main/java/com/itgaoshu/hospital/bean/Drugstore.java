package com.itgaoshu.hospital.bean;

import java.util.Date;

public class Drugstore {
    private Integer rugstoreid;

    private String drugstorename;

    private Integer supplierid;
    private String supplierName;

    private Integer skullid;
    private String skullName;

    private Integer warehouseid;

    private String warehouseName;

    private Integer unit;

    private String unitName;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSkullName() {
        return skullName;
    }

    public void setSkullName(String skullName) {
        this.skullName = skullName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getAreaName() {
        return areaName;
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

    private Double tradeprice;

    private Double sellingprice;

    private Integer area;
    private String areaName;

    private Integer type;
    private String typeName;

    private Date producedate;

    @Override
    public String toString() {
        return "Drugstore{" +
                "rugstoreid=" + rugstoreid +
                ", drugstorename='" + drugstorename + '\'' +
                ", supplierid=" + supplierid +
                ", supplierName='" + supplierName + '\'' +
                ", skullid=" + skullid +
                ", skullName='" + skullName + '\'' +
                ", warehouseid=" + warehouseid +
                ", warehouseName='" + warehouseName + '\'' +
                ", unit=" + unit +
                ", unitName='" + unitName + '\'' +
                ", tradeprice=" + tradeprice +
                ", sellingprice=" + sellingprice +
                ", area=" + area +
                ", areaName='" + areaName + '\'' +
                ", type=" + type +
                ", typeName='" + typeName + '\'' +
                ", producedate=" + producedate +
                ", validdate=" + validdate +
                ", drugstorenum=" + drugstorenum +
                ", batch='" + batch + '\'' +
                '}';
    }

    private Date validdate;

    private Integer drugstorenum;

    private String batch;

    public Integer getRugstoreid() {
        return rugstoreid;
    }

    public void setRugstoreid(Integer rugstoreid) {
        this.rugstoreid = rugstoreid;
    }

    public String getDrugstorename() {
        return drugstorename;
    }

    public void setDrugstorename(String drugstorename) {
        this.drugstorename = drugstorename == null ? null : drugstorename.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getSkullid() {
        return skullid;
    }

    public void setSkullid(Integer skullid) {
        this.skullid = skullid;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Double getTradeprice() {
        return tradeprice;
    }

    public void setTradeprice(Double tradeprice) {
        this.tradeprice = tradeprice;
    }

    public Double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getProducedate() {
        return producedate;
    }

    public void setProducedate(Date producedate) {
        this.producedate = producedate;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public Integer getDrugstorenum() {
        return drugstorenum;
    }

    public void setDrugstorenum(Integer drugstorenum) {
        this.drugstorenum = drugstorenum;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }
}