package com.itgaoshu.hospital.bean;

public class Doctor {
    private Integer doctorId;
    private String doctorName;
    private Integer departmentId;
    private String department;
    private Integer registeredId;
    private String type;
    private Integer dstate;
    private String amstarttime;
    private String amendtime;
    private String pmstarttime;
    private String pmendtime;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(Integer registeredId) {
        this.registeredId = registeredId;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }

    public String getAmstarttime() {
        return amstarttime;
    }

    public void setAmstarttime(String amstarttime) {
        this.amstarttime = amstarttime;
    }

    public String getAmendtime() {
        return amendtime;
    }

    public void setAmendtime(String amendtime) {
        this.amendtime = amendtime;
    }

    public String getPmstarttime() {
        return pmstarttime;
    }

    public void setPmstarttime(String pmstarttime) {
        this.pmstarttime = pmstarttime;
    }

    public String getPmendtime() {
        return pmendtime;
    }

    public void setPmendtime(String pmendtime) {
        this.pmendtime = pmendtime;
    }
}