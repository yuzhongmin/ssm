package com.yzm.service;

import com.yzm.base.BaseService;
import com.yzm.dao.UserMapper;
import com.yzm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User>{
    @Autowired
    private UserMapper userMapper;
}
