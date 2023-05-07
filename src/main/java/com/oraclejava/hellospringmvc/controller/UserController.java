package com.oraclejava.hellospringmvc.controller;

import com.oraclejava.hellospringmvc.model.User;
import com.oraclejava.hellospringmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value="/registerSuccess", method = RequestMethod.POST)
    public String registerSuccess(@ModelAttribute("user")User user){
        userService.addUser(user);
        return "redirect:/listUsers";
    }

    @RequestMapping(value="/listUsers", method = RequestMethod.GET)
    public ModelAndView userInfo() {
        return new ModelAndView("userlistPage", "userlist", userService.getAllUserInfo());
    }
}
