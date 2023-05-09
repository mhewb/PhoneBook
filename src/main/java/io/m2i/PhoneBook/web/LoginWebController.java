package io.m2i.PhoneBook.web;

import io.m2i.PhoneBook.entity.User;
import io.m2i.PhoneBook.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginWebController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model, RedirectAttributes redirectAttrs) {
        boolean isLogged = userService.verifyLogin(user.getEmail(), user.getPassword());
        model.addAttribute("isLogged", isLogged);

        if (isLogged == true) {
            redirectAttrs.addFlashAttribute("user", userService.fetchByEmail(user.getEmail()).get());
            return "redirect:/";
        }


        return "/login";

    }

}
