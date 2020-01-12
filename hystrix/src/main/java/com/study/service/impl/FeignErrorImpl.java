package com.study.service.impl;

import com.study.entity.User;
import com.study.service.FeignService;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * TODO
 *
 * @author joker
 * @date 2020/1/12 17:23
 */
@Component
public class FeignErrorImpl implements FeignService {
    @Override
    public Collection<User> findAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public String index() {
        return "服务器维护中。。。";
    }
}
