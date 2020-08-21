package com.iflyteck.controller;

import com.iflyteck.domain.Account;
import com.iflyteck.domain.User;
import com.iflyteck.repository.AccountRespository;
import com.iflyteck.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
@Api(tags = "springboot项目测试接口")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountRespository accountRespository;

    @RequestMapping(value = "/testUser", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询所有用户", notes = "测试试验使用")
    public List<User> testUser () {
        return userService.queryUserList();
    }

    @RequestMapping(value = "/testAccount",  method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询所有账户", notes = "测试查询使用")
    public List<Account> testAccount () {
        return accountRespository.findAll();
    }

}
