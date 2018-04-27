package ua.pp.avmelnyk.securityapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.pp.avmelnyk.securityapp.UserService;
import ua.pp.avmelnyk.securityapp.models.User;

@Controller
public class RootController {

    private UserService userService;

    @Autowired
    public RootController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/aaa",method = RequestMethod.GET)
    public String loginPage(Model model){
        User user =  userService.getUser(123l);
        System.out.println(user.toString());
        return "redirect:/route/";
    }
}
