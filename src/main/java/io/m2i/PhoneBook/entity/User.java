package io.m2i.PhoneBook.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Users")
public class User extends PeopleAbstract {

    private String password;

    @OneToMany
    private List<Contact> contactList;

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
