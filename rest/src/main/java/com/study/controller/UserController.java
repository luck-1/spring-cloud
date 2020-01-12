package com.study.controller;

import com.study.entity.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * TODO
 *
 * @author joker
 * @date 2020/1/12 14:06
 */
@RestController
@RequestMapping("rest")
public class UserController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("findAll")
    public Collection findAll() {
        return restTemplate.getForObject("http://127.0.01:8000/user/findAll", Collection.class);
    }

    @PostMapping("save")
    public void save(@RequestBody User user) {
        restTemplate.postForEntity("http://127.0.01:8000/user/save", user, void.class);
    }
}
