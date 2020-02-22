package ru.havlong.itonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.havlong.itonline.repositories.UsersRepository;

/**
 * 21.02.19
 * UsersController
 *
 * @author Havlong
 * @version v1.0
 */
@Controller
public class UsersController {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/users")
    public String getUsersPage(ModelMap modelMap) {
        modelMap.addAttribute("usersFromServer", usersRepository.findAll());
        return "users";
    }
}
