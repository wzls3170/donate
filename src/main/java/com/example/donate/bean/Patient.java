package com.example.donate.bean;

public class Patient {
    private String pid;

    private String pname;

    private String ptel;

    private String phome;

    private String pstory;

    private String psick;

    private String ptreat;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPtel() {
        return ptel;
    }

    public void setPtel(String ptel) {
        this.ptel = ptel == null ? null : ptel.trim();
    }

    public String getPhome() {
        return phome;
    }

    public void setPhome(String phome) {
        this.phome = phome == null ? null : phome.trim();
    }

    public String getPstory() {
        return pstory;
    }

    public void setPstory(String pstory) {
        this.pstory = pstory == null ? null : pstory.trim();
    }

    public String getPsick() {
        return psick;
    }

    public void setPsick(String psick) {
        this.psick = psick == null ? null : psick.trim();
    }

    public String getPtreat() {
        return ptreat;
    }

    public void setPtreat(String ptreat) {
        this.ptreat = ptreat == null ? null : ptreat.trim();
    }
}