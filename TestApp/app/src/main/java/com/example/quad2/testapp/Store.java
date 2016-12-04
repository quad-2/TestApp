
 package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Store {

    @SerializedName("data")
    @Expose
    private Data data;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Store() {
    }

    /**
     * 
     * @param data
     */
    public Store(Data data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    public Store withData(Data data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Store{" +
                "data=" + data +
                '}';
    }
}
