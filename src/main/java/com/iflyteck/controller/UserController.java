package com.iflyteck.controller;

import com.iflyteck.domain.Account;
import com.iflyteck.domain.User;
import com.iflyteck.repository.AccountRespository;
import com.iflyteck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountRespository accountRespository;

    @RequestMapping("/testUser")
    @ResponseBody
    public List<User> testUser () {
        return userService.queryUserList();
    }

    @RequestMapping("/testAccount")
    @ResponseBody
    public List<Account> testAccount () {
        return accountRespository.findAll();
    }

}
