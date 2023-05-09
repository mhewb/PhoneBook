package io.m2i.PhoneBook.service;

import io.m2i.PhoneBook.entity.Contact;
import io.m2i.PhoneBook.entity.User;
import io.m2i.PhoneBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> fetchAll() {
        return userRepository.findAll();
    }


    public Optional<User> fetchById(Long id) {
        return userRepository.findById(id);
    }

    public List<Contact> fetchAllContactPerUserId(Long userId) {
        Optional<User> userOptional = fetchById(userId);
        if (userOptional.isEmpty()) {
            return null;
        }
        return userOptional.get().getContactList();
    }
}


