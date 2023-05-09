package io.m2i.PhoneBook.entity;

import jakarta.persistence.*;
import org.hibernate.mapping.Join;

@MappedSuperclass
public abstract class ContactFieldAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identifier; // Company/Home/etc

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}
