package com.itgaoshu.hospital.bean;

public class Type {
    private Integer typeid;

    private String typename;

    @Override
    public String toString() {
        return "Type{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                '}';
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}