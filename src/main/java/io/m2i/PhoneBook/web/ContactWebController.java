package io.m2i.PhoneBook.web;

import io.m2i.PhoneBook.entity.Contact;
import io.m2i.PhoneBook.entity.User;
import io.m2i.PhoneBook.service.ContactService;
import io.m2i.PhoneBook.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/contacts")
public class ContactWebController {

    @Autowired
    private UserService userService;
    @Autowired
    private ContactService contactService;

    @GetMapping
    public String listContact(Model model, @RequestParam("user_id") Long id) {

        User user = userService.fetchById(id).get();
        model.addAttribute("contactList", user.getContactList());
        model.addAttribute("user", user);
        return "contact-list";

    }

    @GetMapping("/create")
    public String createContact(Model model, @RequestParam("user_id") Long idUser) {

        User user = userService.fetchById(idUser).get();
        model.addAttribute("user", user);
        model.addAttribute("contact", new Contact());
        return "contact-form";

    }

    @PostMapping("/create")
    public String createContact(
            Model model,
            @RequestParam("user_id") Long idUser,
            @ModelAttribute Contact contact,
            RedirectAttributes redirectAttr) {

        userService.addContact(idUser, contact);
        redirectAttr.addAttribute("user_id", idUser);

        return "redirect:/contacts";

    }

    @GetMapping("/edit")
    public String editContact(
            Model model,
            @RequestParam("user_id") Long idUser,
            @RequestParam("contact_id") Long idContact) {

        User user = userService.fetchById(idUser).get();
        model.addAttribute("user", user);

        Contact contact = contactService.fetchById(idContact).get();
        model.addAttribute("contact", contact);

        return "contact-form";

    }

    @PostMapping("/edit")
    public String editContact(
            Model model,
            Contact contact,
            @RequestParam("user_id") Long idUser,
            RedirectAttributes redirectAttr) {

        User user = userService.fetchById(idUser).get();

        contactService.save(contact);

        redirectAttr.addAttribute("user_id", idUser);

        return "redirect:/contacts";
    }

    @GetMapping("/delete")
    public String deleteContact(
            Model model,
            @RequestParam("user_id") Long idUser,
            @RequestParam("contact_id") Long idContact,
            RedirectAttributes redirectAttr) {

        User user = userService.fetchById(idUser).get();
        model.addAttribute("user", user);

        contactService.deleteById(idContact);

        redirectAttr.addAttribute("user_id", idUser);
        return "redirect:/contacts";

    }


}
