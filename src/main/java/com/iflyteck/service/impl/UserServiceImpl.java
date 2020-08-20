package com.iflyteck.service.impl;

import com.iflyteck.mapper.UserMapper;
import com.iflyteck.domain.User;
import com.iflyteck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
