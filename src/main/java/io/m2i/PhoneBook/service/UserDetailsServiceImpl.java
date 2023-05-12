package io.m2i.PhoneBook.service;

import io.m2i.PhoneBook.entity.User;
import io.m2i.PhoneBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserDetails userDetails = userRepository
                .findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Email" + email + " not found"));
        return userDetails;
    }
}
