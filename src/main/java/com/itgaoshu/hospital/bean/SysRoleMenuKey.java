package com.itgaoshu.hospital.bean;

import java.util.Arrays;

public class SysRoleMenuKey {
    private Integer id;
    private Integer rid;

    private Integer[] ids;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer[] getMids() {
        return ids;
    }

    public void setMids(Integer[] ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "SysRoleMenuKey{" +
                "id=" + id +
                ", rid=" + rid +
                ", ids=" + Arrays.toString(ids) +
                '}';
    }
}