package com.itgaoshu.hospital.bean;

import java.util.Date;

public class PharmacyVo {
    //药房
    private  Integer pharmacyId;
    private String pharmacyName;
    private  Integer drugstoreId;
    private  Integer skullId;
    private  Integer warehouseId;
    private  Integer unit	;
    private  Double sellingPrice;
    private  Integer area	;
    private  Integer type;
    private Date produceDate;
    private Date validDate	;
    private  Integer drugstorenum;
    private String  skullbatch;
    //药品名
    private  String   drugstoreName;
    //库房名
    private  String warehouseName;
    //经办人
    private  String skullName;
    //计量单位
    private  String unitName;
    //产地名
    private  String areaName;
    //类型
    private  String typeName;

    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public Integer getDrugstoreId() {
        return drugstoreId;
    }

    public void setDrugstoreId(Integer drugstoreId) {
        this.drugstoreId = drugstoreId;
    }

    public Integer getSkullId() {
        return skullId;
    }

    public void setSkullId(Integer skullId) {
        this.skullId = skullId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
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

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Integer getDrugstorenum() {
        return drugstorenum;
    }

    public void setDrugstorenum(Integer drugstorenum) {
        this.drugstorenum = drugstorenum;
    }

    public String getSkullbatch() {
        return skullbatch;
    }

    public void setSkullbatch(String skullbatch) {
        this.skullbatch = skullbatch;
    }

    public String getDrugstoreName() {
        return drugstoreName;
    }

    public void setDrugstoreName(String drugstoreName) {
        this.drugstoreName = drugstoreName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getSkullName() {
        return skullName;
    }

    public void setSkullName(String skullName) {
        this.skullName = skullName;
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

    @Override
    public String toString() {
        return "PharmacyVo{" +
                "pharmacyId=" + pharmacyId +
                ", pharmacyName='" + pharmacyName + '\'' +
                ", drugstoreId=" + drugstoreId +
                ", skullId=" + skullId +
                ", warehouseId=" + warehouseId +
                ", unit=" + unit +
                ", sellingPrice=" + sellingPrice +
                ", area=" + area +
                ", type=" + type +
                ", produceDate=" + produceDate +
                ", validDate=" + validDate +
                ", drugstorenum=" + drugstorenum +
                ", skullbatch='" + skullbatch + '\'' +
                ", drugstoreName='" + drugstoreName + '\'' +
                ", warehouseName='" + warehouseName + '\'' +
                ", skullName='" + skullName + '\'' +
                ", unitName='" + unitName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
