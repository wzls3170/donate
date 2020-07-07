package com.example.donate.bean;

import java.util.Date;
import java.util.List;

public class Item {
    private String iid;

    private Apply apply;

    private String iname;

    private Date iddl;

    private Integer iprogress;

    private Float imoney;

    private List<Donor> donors;

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid == null ? null : iid.trim();
    }

    public Apply getApply() {
        return apply;
    }

    public void setApply(Apply apply) {
        this.apply = apply;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public Date getIddl() {
        return iddl;
    }

    public void setIddl(Date iddl) {
        this.iddl = iddl;
    }

    public Integer getIprogress() {
        return iprogress;
    }

    public void setIprogress(Integer iprogress) {
        this.iprogress = iprogress;
    }

    public Float getImoney() {
        return imoney;
    }

    public void setImoney(Float imoney) {
        this.imoney = imoney;
    }

    public List<Donor> getDonors() {
        return donors;
    }

    public void setDonors(List<Donor> donors) {
        this.donors = donors;
    }
}