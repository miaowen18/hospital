package com.itgaoshu.hospital.bean;

import java.util.List;

public class SysMenuVo {
    private Integer id;

    private Integer pid;

    private String title;

    private String href;

    private Integer spread;

    private String target;

    private String icon;

    private Integer available;

    private List<SysMenuVo> children;

    //复选树的属性
    private String checkArr="0";//默认0//选中1

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getSpread() {
        return spread;
    }

    public void setSpread(Integer spread) {
        this.spread = spread;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public List<SysMenuVo> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenuVo> children) {
        this.children = children;
    }

    public String getCheckArr() {
        return checkArr;
    }

    public void setCheckArr(String checkArr) {
        this.checkArr = checkArr;
    }

    @Override
    public String toString() {
        return "SysMenuVo{" +
                "id=" + id +
                ", pid=" + pid +
                ", title='" + title + '\'' +
                ", href='" + href + '\'' +
                ", spread=" + spread +
                ", target='" + target + '\'' +
                ", icon='" + icon + '\'' +
                ", available=" + available +
                ", children=" + children +
                ", checkArr='" + checkArr + '\'' +
                '}';
    }
}