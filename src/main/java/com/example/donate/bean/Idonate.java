package com.example.donate.bean;

public class Idonate {
    private Integer idoid;

    private Item item;

    private Donor donor;

    private Float dimoney;

    private Integer distate;

    public Integer getIdoid() {
        return idoid;
    }

    public void setIdoid(Integer idoid) {
        this.idoid = idoid;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Float getDimoney() {
        return dimoney;
    }

    public void setDimoney(Float dimoney) {
        this.dimoney = dimoney;
    }

    public Integer getDistate() {
        return distate;
    }

    public void setDistate(Integer distate) {
        this.distate = distate;
    }
}