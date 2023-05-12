package io.m2i.PhoneBook;

import io.m2i.PhoneBook.entity.Role;
import io.m2i.PhoneBook.entity.User;
import io.m2i.PhoneBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class PhoneBookApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(PhoneBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Role userRole = new Role("USER");
		User user = new User();

		user.setFirstname("Jean");
		user.setLastname("Michel");
//		user.setDateOfBirth(new LocalDate(1999, 01, 01));
		user.setEmail("user@user.io");
		user.setPassword(passwordEncoder.encode("user"));
		user.setRoleList(Arrays.asList(userRole));

		userRepository.save(user);
	}
}
