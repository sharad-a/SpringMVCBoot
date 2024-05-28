package com.example.SpringMVCBoot.model;

public class Alien {

    private int aid;
    private String aname;

    // constructor


    public Alien(int aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    // getter and setter
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    // toString()

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }
}
