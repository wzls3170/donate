package com.example.donate.bean;

import java.util.List;

public class Donor {
    private String did;

    private String dname;

    private String dtel;

    private String dsummoney;

    private List<Item> items;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did == null ? null : did.trim();
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDtel() {
        return dtel;
    }

    public void setDtel(String dtel) {
        this.dtel = dtel == null ? null : dtel.trim();
    }

    public String getDsummoney() {
        return dsummoney;
    }

    public void setDsummoney(String dsummoney) {
        this.dsummoney = dsummoney == null ? null : dsummoney.trim();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}