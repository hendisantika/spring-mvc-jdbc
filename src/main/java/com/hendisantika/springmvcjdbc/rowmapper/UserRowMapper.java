package com.hendisantika.springmvcjdbc.rowmapper;

import com.hendisantika.springmvcjdbc.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-mvc-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 17.42
 */
public class UserRowMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int row) throws SQLException {
        User userDetail = new User();
        userDetail.setId(rs.getInt("id"));
        userDetail.setFirstName(rs.getString("first_name"));
        userDetail.setLastName(rs.getString("last_name"));
        userDetail.setEmail(rs.getString("email"));
        userDetail.setDob(rs.getString("dob"));
        return userDetail;
    }
}
