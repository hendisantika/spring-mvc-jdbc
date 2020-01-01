package com.hendisantika.springmvcjdbc.controller;

import com.hendisantika.springmvcjdbc.entity.User;
import com.hendisantika.springmvcjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String getUsersDetails(ModelMap userModel) {
        userModel.addAttribute("userDetail", userDetailService.getAllUserDetail());
        return "users";
    }

    @RequestMapping(value = "addUser")
    public String addPage() {
        return "add";
    }

    @RequestMapping(value = "add/user", method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "fname", required = true) String fname,
                          @RequestParam(value = "lname", required = true) String lname,
                          @RequestParam(value = "email", required = true) String email,
                          @RequestParam(value = "dob", required = true) String dob, ModelMap userModel) {
        User userDetail = new User();
        userDetail.setFirstName(fname);
        userDetail.setLastName(lname);
        userDetail.setEmail(email);
        userDetail.setDob(dob);
        int resp = userDetailService.addUserDetail(userDetail);
        if (resp > 0) {
            userModel.addAttribute("msg", "User with id : " + resp + " added successfully.");
            userModel.addAttribute("userDetail", userDetailService.getAllUserDetail());
            return "users";
        } else {
            userModel.addAttribute("msg", "User addition failed.");
            return "add";
        }
    }

    @RequestMapping(value = "delete/user/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") int id, ModelMap userModel) {
        int resp = userDetailService.deleteUserDetail(id);
        userModel.addAttribute("userDetail", userDetailService.getAllUserDetail());
        if (resp > 0) {
            userModel.addAttribute("msg", "User with id : " + id + " deleted successfully.");
        } else {
            userModel.addAttribute("msg", "User with id : " + id + " deletion failed.");
        }
        return "users";
    }

    @RequestMapping(value = "update/user/{id}", method = RequestMethod.GET)
    public String updatePage(@PathVariable("id") int id, ModelMap userModel) {
        userModel.addAttribute("id", id);
        userModel.addAttribute("userDetail", userDetailService.getUserDetail(id));
        return "update";
    }
}
