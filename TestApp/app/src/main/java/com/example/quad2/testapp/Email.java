
 package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Email {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Email() {
    }

    /**
     * 
     * @param id
     * @param type
     */
    public Email(String type, String id) {
        this.type = type;
        this.id = id;
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

    public Email withType(String type) {
        this.type = type;
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

    public Email withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Email{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
