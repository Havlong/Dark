package ru.havlong.itonline.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 21.02.19
 * LoginController
 *
 * @author Havlong
 * @version v1.0
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLoginPage(Authentication authentication, ModelMap modelMap, HttpServletRequest httpServletRequest) {
        if (authentication != null) {
            return "redirect:/";
        }
        if (httpServletRequest.getParameterMap().containsKey("error")) {
            modelMap.addAttribute("error", true);
        }
        return "login";
    }
}
