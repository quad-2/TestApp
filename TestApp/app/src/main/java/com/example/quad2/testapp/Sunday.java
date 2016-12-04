
 package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sunday {

    @SerializedName("close")
    @Expose
    private String close;
    @SerializedName("open")
    @Expose
    private String open;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sunday() {
    }

    /**
     * 
     * @param open
     * @param close
     */
    public Sunday(String close, String open) {
        this.close = close;
        this.open = open;
    }

    /**
     * 
     * @return
     *     The close
     */
    public String getClose() {
        return close;
    }

    /**
     * 
     * @param close
     *     The close
     */
    public void setClose(String close) {
        this.close = close;
    }

    public Sunday withClose(String close) {
        this.close = close;
        return this;
    }

    /**
     * 
     * @return
     *     The open
     */
    public String getOpen() {
        return open;
    }

    /**
     * 
     * @param open
     *     The open
     */
    public void setOpen(String open) {
        this.open = open;
    }

    public Sunday withOpen(String open) {
        this.open = open;
        return this;
    }

    @Override
    public String toString() {
        return "Sunday{" +
                "close='" + close + '\'' +
                ", open='" + open + '\'' +
                '}';
    }
}
