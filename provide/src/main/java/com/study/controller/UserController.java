package com.study.controller;

import com.study.dao.UserDao;
import com.study.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * TODO
 *
 * @author joker
 * @date 2020/1/12 14:06
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserDao userDao;
    @Value("${server.port}")
    private String port;

    @GetMapping("findAll")
    public Collection<User> findAll(){
        return userDao.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody User user){
        userDao.save(user);
    }

    @GetMapping("index")
    public String index(){
        return "当前端口：" + port;
    }
}
