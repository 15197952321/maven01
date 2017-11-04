package com.action;

import com.model.Users;
import com.service.UsersService;
import com.service.impl.UsersServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
@Controller
public class UsersAction {

    @RequestMapping("/findall")
    @ResponseBody
    public List<Users> findAll(){
        UsersService us = new UsersServiceImpl();
        return us.findAll();
    }

}
