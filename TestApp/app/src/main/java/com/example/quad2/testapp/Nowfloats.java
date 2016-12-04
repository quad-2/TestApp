
 package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nowfloats {

    @SerializedName("parentId")
    @Expose
    private Object parentId;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Nowfloats() {
    }

    /**
     * 
     * @param id
     * @param parentId
     */
    public Nowfloats(Object parentId, String id) {
        this.parentId = parentId;
        this.id = id;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    public Object getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parentId
     */
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Nowfloats withParentId(Object parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Nowfloats withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Nowfloats{" +
                "parentId=" + parentId +
                ", id='" + id + '\'' +
                '}';
    }
}
