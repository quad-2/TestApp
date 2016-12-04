
package com.example.quad2.testapp;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClaimedUser {

    @SerializedName("phoneNumbers")
    @Expose
    private List<PhoneNumber_> phoneNumbers = new ArrayList<PhoneNumber_>();
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("role")
    @Expose
    private Role role;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     */
    public ClaimedUser() {
    }

    /**
     * @param id
     * @param email
     * @param name
     * @param role
     * @param phoneNumbers
     */
    public ClaimedUser(List<PhoneNumber_> phoneNumbers, Object email, Role role, String id, String name) {
        this.phoneNumbers = phoneNumbers;
        this.email = email;
        this.role = role;
        this.id = id;
        this.name = name;
    }

    /**
     * @return The phoneNumbers
     */
    public List<PhoneNumber_> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * @param phoneNumbers The phoneNumbers
     */
    public void setPhoneNumbers(List<PhoneNumber_> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public ClaimedUser withPhoneNumbers(List<PhoneNumber_> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * @return The email
     */
    public Object getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(Object email) {
        this.email = email;
    }

    public ClaimedUser withEmail(Object email) {
        this.email = email;
        return this;
    }

    /**
     * @return The role
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role The role
     */
    public void setRole(Role role) {
        this.role = role;
    }

    public ClaimedUser withRole(Role role) {
        this.role = role;
        return this;
    }

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public ClaimedUser withId(String id) {
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

    public ClaimedUser withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "ClaimedUser{" +
                "phoneNumbers=" + phoneNumbers +
                ", email=" + email +
                ", role=" + role +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
