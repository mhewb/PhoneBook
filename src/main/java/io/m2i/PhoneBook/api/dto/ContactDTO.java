package io.m2i.PhoneBook.api.dto;

import io.m2i.PhoneBook.entity.Address;
import io.m2i.PhoneBook.entity.Email;
import io.m2i.PhoneBook.entity.PhoneNumber;

import java.time.LocalDate;
import java.util.List;

public class ContactDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String avatarUrl;
    private LocalDate dateOfBirth;
    private String nickname;
    private String companyName;
    private String jobTitle;
    private String notes;

    private List<Email> emailList;

    private List<PhoneNumber> phoneNumberList;

    private List<Address> AddressList;

    public ContactDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
