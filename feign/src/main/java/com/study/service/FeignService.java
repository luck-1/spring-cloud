package com.study.service;

import com.study.entity.User;
import com.study.service.impl.FeignErrorImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

/**
 * TODO
 *
 * @author joker
 * @date 2020/1/12 17:06
 */
@FeignClient(value = "provide",fallback = FeignErrorImpl.class)
public interface FeignService {

    @GetMapping("/user/findAll")
    Collection<User> findAll();

    @PostMapping("/user/save")
    void save(@RequestBody User user);

    @GetMapping("/user/index")
    String index();
}
