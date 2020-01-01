package com.hendisantika.springmvcjdbc.service;

import com.hendisantika.springmvcjdbc.dao.UserDao;
import com.hendisantika.springmvcjdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-mvc-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 17.47
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDetailDao;

    public User getUserDetail(int id) {
        return userDetailDao.getUserDetail(id);
    }

}
