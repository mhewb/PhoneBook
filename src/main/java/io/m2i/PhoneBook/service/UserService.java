package io.m2i.PhoneBook.service;

import io.m2i.PhoneBook.entity.Contact;
import io.m2i.PhoneBook.entity.User;
import io.m2i.PhoneBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> fetchAll() {
        return userRepository.findAll();
    }

    public Optional<User> fetchById(Long id) {
        return userRepository.findById(id);
    }
    public Optional<User> fetchByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean verifyLogin(String email, String password) {
        return fetchByEmail(email)
                .map(user -> user.getPassword().equals(password))
                .orElse(false);
    }

    public Contact addContact(Long id, Contact contact) {
        User user = fetchById(id).get();
        user.getContactList().add(contact);
        userRepository.save(user);
        return contact;
    }

    public void save(User user) {
        userRepository.save(user);
    }

}


