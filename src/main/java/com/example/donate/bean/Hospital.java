package com.example.donate.bean;

public class Hospital {
    private String hid;

    private String hname;

    private String htel;

    private String hqualification;

    private String haddress;

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid == null ? null : hid.trim();
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public String getHtel() {
        return htel;
    }

    public void setHtel(String htel) {
        this.htel = htel == null ? null : htel.trim();
    }

    public String getHqualification() {
        return hqualification;
    }

    public void setHqualification(String hqualification) {
        this.hqualification = hqualification == null ? null : hqualification.trim();
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress == null ? null : haddress.trim();
    }
}