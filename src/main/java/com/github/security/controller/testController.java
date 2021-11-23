package com.github.security.controller;

import com.github.security.domain.User;
import com.github.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class testController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/test")
    public User user(){
        return userService.getUserById();
    }
}
