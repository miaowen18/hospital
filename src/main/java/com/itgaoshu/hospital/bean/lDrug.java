package com.itgaoshu.hospital.bean;

public class lDrug {
    private  Integer rugstoreId;
    private  String drugstoreName	;
    private  Integer supplierId;
    private  Integer skullId;

    private  Integer warehouseId;
    private  Integer unit;
    private  double tradePrice;
    private  double sellingPrice;
    private  Integer area;
    private  Integer type ;

    private String produceDate;
    private String  validDate;

    private  Integer  drugstorenum	;
    private  String batch	;




    private  String supplierName;
    private  String warehouseName;
    private  String skullName;
    private  String unitName;
    private  String areaName;
    private  String typeName;

    private Integer typeId;
    private Integer unitId;
    private Integer areaId;

    public Integer getRugstoreId() {
        return rugstoreId;
    }

    public void setRugstoreId(Integer rugstoreId) {
        this.rugstoreId = rugstoreId;
    }

    public String getDrugstoreName() {
        return drugstoreName;
    }

    public void setDrugstoreName(String drugstoreName) {
        this.drugstoreName = drugstoreName;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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

    public double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
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

    public String getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(String produceDate) {
        this.produceDate = produceDate;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
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
        this.batch = batch;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "lDrug{" +
                "rugstoreId=" + rugstoreId +
                ", drugstoreName='" + drugstoreName + '\'' +
                ", supplierId=" + supplierId +
                ", skullId=" + skullId +
                ", warehouseId=" + warehouseId +
                ", unit=" + unit +
                ", tradePrice=" + tradePrice +
                ", sellingPrice=" + sellingPrice +
                ", area=" + area +
                ", type=" + type +
                ", produceDate='" + produceDate + '\'' +
                ", validDate='" + validDate + '\'' +
                ", drugstorenum=" + drugstorenum +
                ", batch='" + batch + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", warehouseName='" + warehouseName + '\'' +
                ", skullName='" + skullName + '\'' +
                ", unitName='" + unitName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", typeId=" + typeId +
                ", unitId=" + unitId +
                ", areaId=" + areaId +
                '}';
    }
}