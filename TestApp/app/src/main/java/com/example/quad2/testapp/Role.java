
 package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("id")
    @Expose
    private long id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Role() {
    }

    /**
     * 
     * @param id
     * @param description
     * @param label
     */
    public Role(String description, String label, long id) {
        this.description = description;
        this.label = label;
        this.id = id;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Role withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    public Role withLabel(String label) {
        this.label = label;
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

    public Role withId(long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Role{" +
                "description='" + description + '\'' +
                ", label='" + label + '\'' +
                ", id=" + id +
                '}';
    }
}
