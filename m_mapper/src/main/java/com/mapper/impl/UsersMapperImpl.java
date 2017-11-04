package com.mapper.impl;

import com.mapper.UsersMapper;
import com.model.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class UsersMapperImpl implements UsersMapper  {

    @Override
    public List<Users> findAll() {
        List<Users> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Users u = new Users();
            u.setUid(i);
            u.setUname("li"+i);
            users.add(u);
        }
        return users;
    }

}
