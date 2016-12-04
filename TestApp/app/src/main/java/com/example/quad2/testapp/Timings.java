
package com.example.quad2.testapp;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timings {

    @SerializedName("tuesday")
    @Expose
    private List<Tuesday> tuesday = new ArrayList<Tuesday>();
    @SerializedName("thursday")
    @Expose
    private List<Thursday> thursday = new ArrayList<Thursday>();
    @SerializedName("friday")
    @Expose
    private List<Friday> friday = new ArrayList<Friday>();
    @SerializedName("saturday")
    @Expose
    private List<Saturday> saturday = new ArrayList<Saturday>();
    @SerializedName("sunday")
    @Expose
    private List<Sunday> sunday = new ArrayList<Sunday>();
    @SerializedName("wednesday")
    @Expose
    private List<Wednesday> wednesday = new ArrayList<Wednesday>();
    @SerializedName("monday")
    @Expose
    private List<Monday> monday = new ArrayList<Monday>();

    /**
     * No args constructor for use in serialization
     */
    public Timings() {
    }

    /**
     * @param wednesday
     * @param monday
     * @param thursday
     * @param sunday
     * @param saturday
     * @param friday
     * @param tuesday
     */
    public Timings(List<Tuesday> tuesday, List<Thursday> thursday, List<Friday> friday, List<Saturday> saturday, List<Sunday> sunday, List<Wednesday> wednesday, List<Monday> monday) {
        this.tuesday = tuesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.wednesday = wednesday;
        this.monday = monday;
    }

    /**
     * @return The tuesday
     */
    public List<Tuesday> getTuesday() {
        return tuesday;
    }

    /**
     * @param tuesday The tuesday
     */
    public void setTuesday(List<Tuesday> tuesday) {
        this.tuesday = tuesday;
    }

    public Timings withTuesday(List<Tuesday> tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    /**
     * @return The thursday
     */
    public List<Thursday> getThursday() {
        return thursday;
    }

    /**
     * @param thursday The thursday
     */
    public void setThursday(List<Thursday> thursday) {
        this.thursday = thursday;
    }

    public Timings withThursday(List<Thursday> thursday) {
        this.thursday = thursday;
        return this;
    }

    /**
     * @return The friday
     */
    public List<Friday> getFriday() {
        return friday;
    }

    /**
     * @param friday The friday
     */
    public void setFriday(List<Friday> friday) {
        this.friday = friday;
    }

    public Timings withFriday(List<Friday> friday) {
        this.friday = friday;
        return this;
    }

    /**
     * @return The saturday
     */
    public List<Saturday> getSaturday() {
        return saturday;
    }

    /**
     * @param saturday The saturday
     */
    public void setSaturday(List<Saturday> saturday) {
        this.saturday = saturday;
    }

    public Timings withSaturday(List<Saturday> saturday) {
        this.saturday = saturday;
        return this;
    }

    /**
     * @return The sunday
     */
    public List<Sunday> getSunday() {
        return sunday;
    }

    /**
     * @param sunday The sunday
     */
    public void setSunday(List<Sunday> sunday) {
        this.sunday = sunday;
    }

    public Timings withSunday(List<Sunday> sunday) {
        this.sunday = sunday;
        return this;
    }

    /**
     * @return The wednesday
     */
    public List<Wednesday> getWednesday() {
        return wednesday;
    }

    /**
     * @param wednesday The wednesday
     */
    public void setWednesday(List<Wednesday> wednesday) {
        this.wednesday = wednesday;
    }

    public Timings withWednesday(List<Wednesday> wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    /**
     * @return The monday
     */
    public List<Monday> getMonday() {
        return monday;
    }

    /**
     * @param monday The monday
     */
    public void setMonday(List<Monday> monday) {
        this.monday = monday;
    }

    public Timings withMonday(List<Monday> monday) {
        this.monday = monday;
        return this;
    }

    @Override
    public String toString() {
        return "Timings{" +
                "tuesday=" + tuesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", saturday=" + saturday +
                ", sunday=" + sunday +
                ", wednesday=" + wednesday +
                ", monday=" + monday +
                '}';
    }
}
