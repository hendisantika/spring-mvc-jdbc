package com.hendisantika.springmvcjdbc.entity;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-mvc-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 17.37
 */

@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
}
