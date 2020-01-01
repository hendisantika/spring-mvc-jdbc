package com.hendisantika.springmvcjdbc.controller;

import com.hendisantika.springmvcjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-mvc-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 17.51
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userDetailService;
}
