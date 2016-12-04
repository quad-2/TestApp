
 package com.example.quad2.testapp; ;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tuesday {

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
    public Tuesday() {
    }

    /**
     * 
     * @param open
     * @param close
     */
    public Tuesday(String close, String open) {
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

    public Tuesday withClose(String close) {
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

    public Tuesday withOpen(String open) {
        this.open = open;
        return this;
    }

    @Override
    public String toString() {
        return "Tuesday{" +
                "close='" + close + '\'' +
                ", open='" + open + '\'' +
                '}';
    }
}
