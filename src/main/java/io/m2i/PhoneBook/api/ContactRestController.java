package io.m2i.PhoneBook.api;

import io.m2i.PhoneBook.api.dto.ContactDTO;
import io.m2i.PhoneBook.api.dto.UserDTO;
import io.m2i.PhoneBook.entity.Contact;
import io.m2i.PhoneBook.entity.User;
import io.m2i.PhoneBook.service.ContactService;
import io.m2i.PhoneBook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contacts")
public class ContactRestController {

    @Autowired
    private UserService userService;
    @Autowired
    private ContactService contactService;
    @Autowired
    private ContactMapper contactMapper;
    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public List<Contact> all() {
        return contactService.fetchAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getByUserId(@PathVariable(name = "id") Long id){

//        List<ContactDTO> contactList = userService
//                .fetchById(id).get().getContactList()
//                .stream()
//                .map(Contact::toDTO)
//                .collect(Collectors.toList());
        Optional<User> userOptional = userService.fetchById(id);

        if (userOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        UserDTO userDTO = userMapper.toDTO(userOptional.get());

        return ResponseEntity.ok(userDTO);
    }



}
