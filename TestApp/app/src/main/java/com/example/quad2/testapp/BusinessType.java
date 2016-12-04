package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BusinessType {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     */
    public BusinessType() {
    }

    /**
     * @param id
     * @param name
     */
    public BusinessType(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return The id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(long id) {
        this.id = id;
    }

    public BusinessType withId(long id) {
        this.id = id;
        return this;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public BusinessType withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "BusinessType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
