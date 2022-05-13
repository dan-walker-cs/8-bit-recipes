package com.danwalkercs.eight_bit_recipes.service.user;

import com.danwalkercs.eight_bit_recipes.entity.data.User;
import com.danwalkercs.eight_bit_recipes.repository.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserListingService {

    @Autowired
    private UserRepository userRepository;


    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }
}
