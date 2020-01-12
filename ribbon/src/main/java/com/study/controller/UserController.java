package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author joker
 * @date 2020/1/12 14:06
 */
@RestController
@RequestMapping("ribbon")
public class UserController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("index")
    public String index() {
        return restTemplate.getForObject("http://provide/user/index", String.class);
    }
}
