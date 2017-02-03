package com.galvanize;

import java.lang.String;

/**
 * Created by hemiola on 2/3/17.
 */
public class Address {
    /**
     *
     * encapsulated variables, for inheritance
     */
    private String street;
    private String city;
    private String state;
    private String zip;

    /*
     * Constructor
     */
    public Address(String street, String city, String state, String zip) {
        this.setStreet(street);
        this.setCity(city);
        this.setState(state);
        this.setZip(zip);
    }

    @Override public String toString() {
        return this.getStreet() + ", " + this.getCity() + ", " + this.getState() + " " + this.getZip();
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}