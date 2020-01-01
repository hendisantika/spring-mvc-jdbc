package com.hendisantika.springmvcjdbc.dao;

import com.hendisantika.springmvcjdbc.entity.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-mvc-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 17.38
 */
public interface UserDao {

    User getUserDetail(int id);

    List<User> getAllUserDetail();

    int addUserDetail(User userDetail);

    int updateUserDetail(User userDetail);

    int deleteUserDetail(int id);

}