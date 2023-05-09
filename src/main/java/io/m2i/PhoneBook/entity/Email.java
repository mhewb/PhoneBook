package io.m2i.PhoneBook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emails")
public class Email extends ContactFieldAbstract {

    private String address;

    public Email() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
