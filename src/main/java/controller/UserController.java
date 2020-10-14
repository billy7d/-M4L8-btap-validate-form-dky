package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.UserServiceInterface;

import javax.validation.Valid;

@Controller
public class UserController {


    @Autowired
    private UserServiceInterface userServiceInterface;

    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/")
    public String validateForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,Model model){
        if (bindingResult.hasFieldErrors()){

            return "index";
        } else {
            model.addAttribute("user", user);
            userServiceInterface.save(user);
            return "result";
        }
    }
}
