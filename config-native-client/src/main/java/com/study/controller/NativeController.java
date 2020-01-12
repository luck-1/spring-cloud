package com.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author joker
 * @date 2020/1/12 14:06
 */
@RestController
@RequestMapping("native")
public class NativeController {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("index")
    public String index() {
        return "port(" + port + "),foo(" + foo + ")";
    }
}