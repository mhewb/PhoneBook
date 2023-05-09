package io.m2i.PhoneBook.entity;

import io.m2i.PhoneBook.api.dto.ContactDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Contacts")
public class Contact extends PeopleAbstract {

    private String nickname;
    private String companyName;
    private String jobTitle;

    @Column(columnDefinition = "text")
    private String notes;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "contact_id")
    private List<Email> emailList;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "contact_id")
    private List<PhoneNumber> phoneNumberList;


    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "contact_id")
    private List<Address> AddressList;

    public Contact() {
    }

    public ContactDTO toDTO() {

        ContactDTO dto = new ContactDTO();

        dto.setId(this.getId());
        dto.setFirstname(this.getFirstname());
        dto.setLastname(this.getLastname());
        dto.setAvatarUrl(this.getAvatarUrl());
        dto.setDateOfBirth(this.getDateOfBirth());
        dto.setNickname(this.getNickname());
        dto.setCompanyName(this.getCompanyName());
        dto.setJobTitle(this.getJobTitle());
        dto.setNotes(this.getNotes());
        dto.setEmailList(this.getEmailList());
        dto.setPhoneNumberList(this.getPhoneNumberList());
        dto.setAddressList(this.getAddressList());

        return dto;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Email> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<Email> emailList) {
        this.emailList = emailList;
    }

    public List<PhoneNumber> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<PhoneNumber> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    public List<Address> getAddressList() {
        return AddressList;
    }

    public void setAddressList(List<Address> addressList) {
        AddressList = addressList;
    }



}
