
package com.example.quad2.testapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("pin")
    @Expose
    private String pin;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("landmark")
    @Expose
    private String landmark;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("addressLine")
    @Expose
    private String addressLine;

    /**
     * No args constructor for use in serialization
     */
    public Address() {
    }

    /**
     * @param addressLine
     * @param landmark
     * @param pin
     * @param street
     * @param state
     * @param locality
     * @param country
     * @param city
     */
    public Address(String state, String pin, String city, String locality, String landmark, String country, String street, String addressLine) {
        this.state = state;
        this.pin = pin;
        this.city = city;
        this.locality = locality;
        this.landmark = landmark;
        this.country = country;
        this.street = street;
        this.addressLine = addressLine;
    }

    /**
     * @return The state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state The state
     */
    public void setState(String state) {
        this.state = state;
    }

    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * @return The pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin The pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    public Address withPin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * @return The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     * @param locality The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Address withLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * @return The landmark
     */
    public String getLandmark() {
        return landmark;
    }

    /**
     * @param landmark The landmark
     */
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Address withLandmark(String landmark) {
        this.landmark = landmark;
        return this;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public Address withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * @return The street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street The street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * @return The addressLine
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * @param addressLine The addressLine
     */
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public Address withAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                ", city='" + city + '\'' +
                ", locality='" + locality + '\'' +
                ", landmark='" + landmark + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", addressLine='" + addressLine + '\'' +
                '}';
    }
}
