package com.study.dao;

import com.study.entity.User;

import java.util.Collection;

/**
 * TODO
 *
 * @author joker
 * @date 2020/1/12 13:45
 */
public interface UserDao {
    Collection<User> findAll();

    void save( User user);
}
