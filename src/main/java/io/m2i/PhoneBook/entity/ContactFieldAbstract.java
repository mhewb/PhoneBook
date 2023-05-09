package io.m2i.PhoneBook.entity;

import jakarta.persistence.*;
import org.hibernate.mapping.Join;

@MappedSuperclass
public abstract class ContactFieldAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long identifier; // Company/Home/etc
    @ManyToOne
    @JoinColumn(name = "contact_fk")
    private Contact contact;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
