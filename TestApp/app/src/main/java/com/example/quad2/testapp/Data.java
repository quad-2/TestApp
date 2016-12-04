
 package com.example.quad2.testapp; ;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("businesses")
    @Expose
    private List<Business> businesses = new ArrayList<>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param businesses
     */
    public Data(List<Business> businesses) {
        this.businesses = businesses;
    }

    /**
     * 
     * @return
     *     The businesses
     */
    public List<Business> getBusinesses() {
        return businesses;
    }

    /**
     * 
     * @param businesses
     *     The businesses
     */
    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    public Data withBusinesses(List<Business> businesses) {
        this.businesses = businesses;
        return this;
    }

    @Override
    public String toString() {
        return "Data{" +
                "businesses=" + businesses +
                '}';
    }
}
