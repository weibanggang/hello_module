package com.wbg.entity;

public class userstype {
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    private  int tid;

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTmremarks() {
        return tmremarks;
    }

    public userstype(int tid, String tname, String tmremarks) {
        this.tid = tid;
        this.tname = tname;
        this.tmremarks = tmremarks;
    }

    public userstype() {
        super();
    }

    public void setTmremarks(String tmremarks) {
        this.tmremarks = tmremarks;
    }

    private String tname;
    private String tmremarks;

    @Override
    public String toString() {
        return "userstype{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tmremarks='" + tmremarks + '\'' +
                '}';
    }
}
