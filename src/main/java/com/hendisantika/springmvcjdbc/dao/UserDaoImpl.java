package com.hendisantika.springmvcjdbc.dao;

import com.hendisantika.springmvcjdbc.entity.User;
import com.hendisantika.springmvcjdbc.rowmapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-mvc-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 17.41
 */
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public User getUserDetail(int id) {
        User userDetail = jdbcTemplate.queryForObject("select * from user_detail where id = ?",
                new Object[]{id}, new UserRowMapper());
        return userDetail;
    }

    @Transactional
    public List<User> getAllUserDetail() {
        List<User> userDetail = jdbcTemplate.query("select * from user_detail",
                new UserRowMapper());
        return userDetail;
    }

    @Transactional
    public int addUserDetail(User userDetail) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        simpleJdbcInsert.withTableName("user_detail").usingGeneratedKeyColumns("id");
        Map<String, Object> parameters = new HashMap<String, Object>(4);
        parameters.put("first_name", userDetail.getFirstName());
        parameters.put("last_name", userDetail.getLastName());
        parameters.put("email", userDetail.getEmail());
        parameters.put("dob", userDetail.getDob());
        Number insertedId = simpleJdbcInsert.executeAndReturnKey(parameters);
        return insertedId.intValue();
    }

}
