package com.iflyteck.controller;

import com.iflyteck.domain.User;
import com.iflyteck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/testUser")
    @ResponseBody
    public List<User> testUser () {
        return userService.queryUserList();
    }
}
