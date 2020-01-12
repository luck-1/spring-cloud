package com.study.dao.impl;

import com.study.dao.UserDao;
import com.study.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author joker
 * @date 2020/1/12 13:46
 */
@Repository
public class UserDaoImpl implements UserDao {

    private static Map<Integer, User> userMap;

    @PostConstruct
    private void init() {
        userMap = new HashMap<Integer, User>(4) {{
            put(1, new User(1, "赵一", 1));
            put(2, new User(2, "钱二", 2));
        }};
    }

    @Override
    public Collection<User> findAll() {
        return userMap.values();
    }

    @Override
    public void save(User user) {
        userMap.put(user.getId(), user);
    }
}
