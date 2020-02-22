package ru.havlong.itonline.controllers;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.havlong.itonline.security.details.UserDetailsImpl;
import ru.havlong.itonline.transfer.UserDTO;

/**
 * 21.02.19
 * ProfileController
 *
 * @author Havlong
 * @version v1.0
 */
@Controller
public class ProfileController {
    @GetMapping("/")
    public String getProfilePage(ModelMap modelMap, Authentication authentication) {
        if (authentication == null) {
            return "redirect:/login";
        }
        UserDetailsImpl details = (UserDetailsImpl) authentication.getPrincipal();
        UserDTO userDTO = UserDTO.from(details.getUser());
        modelMap.addAttribute("user", userDTO);
        return "profile";
    }
}
