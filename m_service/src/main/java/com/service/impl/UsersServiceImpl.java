package com.service.impl;

import com.mapper.UsersMapper;
import com.mapper.impl.UsersMapperImpl;
import com.model.Users;
import com.service.UsersService;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class UsersServiceImpl implements UsersService {

    @Override
    public List<Users> findAll() {
        UsersMapper um = new UsersMapperImpl();
        return um.findAll();
    }

}
