package io.m2i.PhoneBook.service;

import io.m2i.PhoneBook.entity.Contact;
import io.m2i.PhoneBook.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> fetchAll() {
        return contactRepository.findAll();
    }

    public Optional<Contact> fetchById(Long id) {
        return contactRepository.findById(id);
    }

    public void save(Contact contact) {
        contactRepository.save(contact);
    }
    public void deleteById(Long id) {
        contactRepository.deleteById(id);
    }

}

