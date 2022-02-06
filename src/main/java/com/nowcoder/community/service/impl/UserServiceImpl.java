package com.nowcoder.community.service.impl;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author javaercdy
 * @create 2022-02-05$-{TIME}
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserById(int id) {
        User user = userMapper.selectUserById(id);
        return user;
    }
}
