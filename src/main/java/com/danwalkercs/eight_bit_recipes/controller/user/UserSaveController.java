package com.danwalkercs.eight_bit_recipes.controller.user;

import com.danwalkercs.eight_bit_recipes.entity.data.User;
import com.danwalkercs.eight_bit_recipes.service.user.UserSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserSaveController {

    @Autowired
    private UserSaveService userSaveService;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userSaveService.save(user);
    }
}
