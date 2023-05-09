package io.m2i.PhoneBook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PhoneNumbers")
public class PhoneNumber extends ContactFieldAbstract {

    private String number;

    public PhoneNumber() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
