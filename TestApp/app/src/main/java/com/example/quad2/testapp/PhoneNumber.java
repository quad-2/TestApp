
 package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhoneNumber {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("number")
    @Expose
    private String number;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PhoneNumber() {
    }

    /**
     * 
     * @param number
     * @param type
     */
    public PhoneNumber(String type, String number) {
        this.type = type;
        this.number = number;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public PhoneNumber withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneNumber withNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
