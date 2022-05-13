package com.danwalkercs.eight_bit_recipes.controller.user;

import com.danwalkercs.eight_bit_recipes.entity.data.User;
import com.danwalkercs.eight_bit_recipes.service.user.UserListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user/listing")
public class UserListingController {

    @Autowired
    private UserListingService userListingService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> listAllUsers() {
        return userListingService.retrieveAllUsers();
    }
}
