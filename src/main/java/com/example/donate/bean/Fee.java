package com.example.donate.bean;

public class Fee {
    private String fid;

    private Item item;

    private Float rfe;

    private Float mfe;

    private Float hfe;

    private Float ofe;

    private Float smoney;

    private Integer fstate;

    private Float sfe;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Float getRfe() {
        return rfe;
    }

    public void setRfe(Float rfe) {
        this.rfe = rfe;
    }

    public Float getMfe() {
        return mfe;
    }

    public void setMfe(Float mfe) {
        this.mfe = mfe;
    }

    public Float getHfe() {
        return hfe;
    }

    public void setHfe(Float hfe) {
        this.hfe = hfe;
    }

    public Float getOfe() {
        return ofe;
    }

    public void setOfe(Float ofe) {
        this.ofe = ofe;
    }

    public Float getSmoney() {
        return smoney;
    }

    public void setSmoney(Float smoney) {
        this.smoney = smoney;
    }

    public Integer getFstate() {
        return fstate;
    }

    public void setFstate(Integer fstate) {
        this.fstate = fstate;
    }

    public Float getSfe() {
        return sfe;
    }

    public void setSfe(Float sfe) {
        this.sfe = sfe;
    }
}