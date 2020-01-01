package com.hendisantika.springmvcjdbc.controller;

import com.hendisantika.springmvcjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public String getUserDetail(@PathVariable int id, ModelMap userModel) {
        userModel.addAttribute("userDetail", userDetailService.getUserDetail(id));
        return "user";
    }

}
