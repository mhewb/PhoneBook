package io.m2i.PhoneBook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Addresses")
public class Address extends ContactFieldAbstract {
    private String number;
    private String roadPrefix;
    private String roadName;
    private String complement;
    private String zipCode;
    private String city;


    public Address() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRoadPrefix() {
        return roadPrefix;
    }

    public void setRoadPrefix(String roadPrefix) {
        this.roadPrefix = roadPrefix;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
