
 package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subcategory {

    @SerializedName("keywords")
    @Expose
    private Object keywords;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Subcategory() {
    }

    /**
     * 
     * @param id
     * @param keywords
     * @param name
     */
    public Subcategory(Object keywords, long id, String name) {
        this.keywords = keywords;
        this.id = id;
        this.name = name;
    }

    /**
     * 
     * @return
     *     The keywords
     */
    public Object getKeywords() {
        return keywords;
    }

    /**
     * 
     * @param keywords
     *     The keywords
     */
    public void setKeywords(Object keywords) {
        this.keywords = keywords;
    }

    public Subcategory withKeywords(Object keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(long id) {
        this.id = id;
    }

    public Subcategory withId(long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Subcategory withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Subcategory{" +
                "keywords=" + keywords +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
