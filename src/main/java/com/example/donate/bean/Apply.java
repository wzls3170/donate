package com.example.donate.bean;



import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Apply{
    private String aid;

    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addl;

    private Float amoney;

    private Integer astate;

    Patient patient;

    Hospital hospital;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public Date getAddl() {
        return addl;
    }

    public void setAddl(Date addl) {
        this.addl = addl;
    }

    public Float getAmoney() {
        return amoney;
    }

    public void setAmoney(Float amoney) {
        this.amoney = amoney;
    }

    public Integer getAstate() {
        return astate;
    }

    public void setAstate(Integer astate) {
        this.astate = astate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}