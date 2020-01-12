package com.study.controller;

import com.study.entity.User;
import com.study.service.FeignService;
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
@RequestMapping("hystrix")
public class UserController {
    @Resource
    private FeignService feignService;

    @GetMapping("findAll")
    public Collection<User> findAll() {
        return feignService.findAll();
    }

    @PostMapping("save")
    public void save(@RequestBody User user) {
        feignService.save(user);
    }

    @GetMapping("index")
    public String index() {
        return feignService.index();
    }
}
