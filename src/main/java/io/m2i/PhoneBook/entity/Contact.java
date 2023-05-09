package io.m2i.PhoneBook.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Contacts")
public class Contact extends PeopleAbstract {

    private String nickname;
    private String companyName;
    private String jobTitle;
    private String notes;

    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE},
            mappedBy = "contact")
    private List<Email> emailList;

    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE},
            mappedBy = "contact")
    private List<PhoneNumber> phoneNumberList;


    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE},
            mappedBy = "contact")
    private List<Address> AddressList;


}
