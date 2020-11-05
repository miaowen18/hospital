package com.itgaoshu.hospital.bean;

import java.util.Date;

public class Register {
    private Integer registerid;

    private String userName;

    private Integer age;

    private String sex;

    private Integer departmentId;

    private Integer doctor;

    private String diagnose;

    private String address;

    private String Phone;

    private String Idcard;

    private Date registerDate;



    Integer bedId;

    private String Operator;

    private Double money;

    private Integer state;

    private Date endDate;

    private Double price;

    private String discount;

    private Date zhuan;

    private String department;

    private String doctorName;

    String bedName;

    private Integer doctorId;

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDoctor() {
        return doctor;
    }

    public void setDoctor(Integer doctor) {
        this.doctor = doctor;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getIdcard() {
        return Idcard;
    }

    public void setIdcard(String idcard) {
        Idcard = idcard;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }



    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Date getZhuan() {
        return zhuan;
    }

    public void setZhuan(Date zhuan) {
        this.zhuan = zhuan;
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

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    @Override
    public String toString() {
        return "Register{" +
                "registerid=" + registerid +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", departmentId=" + departmentId +
                ", doctor=" + doctor +
                ", diagnose='" + diagnose + '\'' +
                ", address='" + address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Idcard='" + Idcard + '\'' +
                ", registerDate=" + registerDate +

                ", bedId=" + bedId +
                ", Operator='" + Operator + '\'' +
                ", money=" + money +
                ", state=" + state +
                ", endDate=" + endDate +
                ", price=" + price +
                ", discount='" + discount + '\'' +
                ", zhuan=" + zhuan +
                ", department='" + department + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", bedName='" + bedName + '\'' +
                ", doctorId=" + doctorId +
                '}';
    }
}