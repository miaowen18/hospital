package com.itgaoshu.hospital.bean;

public class Bed {
    private Integer bedId;

    private String bedname;

    private Integer departmentId;

    private Integer state;

    private Double Price;

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public String getBedname() {
        return bedname;
    }

    public void setBedname(String bedname) {
        this.bedname = bedname;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "bedId=" + bedId +
                ", bedname='" + bedname + '\'' +
                ", departmentId=" + departmentId +
                ", state=" + state +
                ", Price=" + Price +
                '}';
    }
}