package ru.havlong.itonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.havlong.itonline.forms.UserForm;
import ru.havlong.itonline.repositories.UsersRepository;
import ru.havlong.itonline.services.SignUpService;

/**
 * 21.02.19
 * SignUpController
 *
 * @author Havlong
 * @version v1.0
 */
@Controller
public class SignUpController {

    private final SignUpService signUpService;

    private final UsersRepository usersRepository;

    @Autowired
    public SignUpController(SignUpService signUpService, UsersRepository usersRepository) {
        this.signUpService = signUpService;
        this.usersRepository = usersRepository;
    }

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm, ModelMap modelMap) {
        if (!userForm.getPassword().equals(userForm.getRepeatPassword())) {
            modelMap.addAttribute("signupError", "true");
            modelMap.addAttribute("alert", "Пароли не совпадают");
            return "signUp";
        } else if (!userForm.getUsername().matches("[A-Za-z.,_{};*+-]{4,48}")) {
            modelMap.addAttribute("signupError", "true");
            modelMap.addAttribute("alert", "Некорректное имя пользователя. " +
                    "Используйте латинские буквы, цифры и символы .,_{};*+-");
            return "signUp";
        } else if (usersRepository.findOneByUserName(userForm.getUsername()).isPresent()) {
            modelMap.addAttribute("signupError", "true");
            modelMap.addAttribute("alert", "Имя пользователя занято");
            return "signUp";
        } else if (!userForm.getFirstName().matches("[А-Я][а-я]*") ||
                !userForm.getLastName().matches("[А-Я][а-я]*")) {
            modelMap.addAttribute("signupError", "true");
            modelMap.addAttribute("alert", "Введите имя и фамилию кириллицей");
            return "signUp";
        }
        signUpService.signUp(userForm);
        return "redirect:/login";
    }
}
