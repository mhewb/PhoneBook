package io.m2i.PhoneBook.api.dto;

import java.time.LocalDate;
import java.util.List;

public class UserDTO {

    private Long id;
    private String firstname;
    private String lastname;
    private String avatarUrl;
    private LocalDate dateOfBirth;
    private String email;
    private List<ContactDTO> contactDTOs;

    public UserDTO() {
    }

    public UserDTO(Long id, String firstname, String lastname,
                   String avatarUrl, LocalDate dateOfBirth,
                   String email, List<ContactDTO> contactDTOs) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.avatarUrl = avatarUrl;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.contactDTOs = contactDTOs;
    }

    public UserDTO(String firstname, String lastname,
                   String avatarUrl, LocalDate dateOfBirth,
                   String email, List<ContactDTO> contactDTOs) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.avatarUrl = avatarUrl;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.contactDTOs = contactDTOs;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ContactDTO> getContactDTOs() {
        return contactDTOs;
    }

    public void setContactDTOs(List<ContactDTO> contactDTOs) {
        this.contactDTOs = contactDTOs;
    }
}
