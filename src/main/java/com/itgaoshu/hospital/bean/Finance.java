package com.itgaoshu.hospital.bean;

public class Finance {
    private String name;
    private Double value;
    private String year;
    private String doctorName;
    private Integer num;
    private Double total;
    private String ctime;
    private String durgname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getDurgname() {
        return durgname;
    }

    public void setDurgname(String durgname) {
        this.durgname = durgname;
    }

    @Override
    public String toString() {
        return "Finance{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", year='" + year + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", num=" + num +
                ", total=" + total +
                ", ctime='" + ctime + '\'' +
                ", durgname='" + durgname + '\'' +
                '}';
    }
}