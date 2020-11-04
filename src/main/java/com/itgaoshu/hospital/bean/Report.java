package com.itgaoshu.hospital.bean;

import java.util.Date;

public class Report {
    private Integer reportId;
    private String reportName;
    private String sex;
    private Integer age;
    private Integer rdepartmentid;//科室id
    private Integer rdoctorid;//医生id
    private Integer rregisteredid;//挂号类型id
    private String department;//科室
    private String doctorName;//医生姓名
    private String type;//挂号类型
    private Double price;
    private Date time;
    private String users;
    private Integer state;
    private String phone;
    private String carid;
    private String zhuan;

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRdepartmentid() {
        return rdepartmentid;
    }

    public void setRdepartmentid(Integer rdepartmentid) {
        this.rdepartmentid = rdepartmentid;
    }

    public Integer getRdoctorid() {
        return rdoctorid;
    }

    public void setRdoctorid(Integer rdoctorid) {
        this.rdoctorid = rdoctorid;
    }

    public Integer getRregisteredid() {
        return rregisteredid;
    }

    public void setRregisteredid(Integer rregisteredid) {
        this.rregisteredid = rregisteredid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan;
    }
}