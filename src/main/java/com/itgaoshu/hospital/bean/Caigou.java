package com.itgaoshu.hospital.bean;

public class Caigou {
    private Integer caigouid;

    private String caigouname;

    private String gonghuoshang;

    private String danwei;

    private String candi;

    private String leixing;

    private Integer shuliang;

    @Override
    public String toString() {
        return "Caigou{" +
                "caigouid=" + caigouid +
                ", caigouname='" + caigouname + '\'' +
                ", gonghuoshang='" + gonghuoshang + '\'' +
                ", danwei='" + danwei + '\'' +
                ", candi='" + candi + '\'' +
                ", leixing='" + leixing + '\'' +
                ", shuliang=" + shuliang +
                '}';
    }

    public Integer getCaigouid() {
        return caigouid;
    }

    public void setCaigouid(Integer caigouid) {
        this.caigouid = caigouid;
    }

    public String getCaigouname() {
        return caigouname;
    }

    public void setCaigouname(String caigouname) {
        this.caigouname = caigouname == null ? null : caigouname.trim();
    }

    public String getGonghuoshang() {
        return gonghuoshang;
    }

    public void setGonghuoshang(String gonghuoshang) {
        this.gonghuoshang = gonghuoshang == null ? null : gonghuoshang.trim();
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei == null ? null : danwei.trim();
    }

    public String getCandi() {
        return candi;
    }

    public void setCandi(String candi) {
        this.candi = candi == null ? null : candi.trim();
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing == null ? null : leixing.trim();
    }

    public Integer getShuliang() {
        return shuliang;
    }

    public void setShuliang(Integer shuliang) {
        this.shuliang = shuliang;
    }
}