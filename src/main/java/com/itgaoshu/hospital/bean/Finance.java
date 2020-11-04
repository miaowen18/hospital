package com.itgaoshu.hospital.bean;

public class Finance {
    private String name;
    private Double value;
    private String year;

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

    @Override
    public String toString() {
        return "Finance{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", year='" + year + '\'' +
                '}';
    }
}