package com.danwalkercs.eight_bit_recipes.service.user;

import com.danwalkercs.eight_bit_recipes.entity.data.User;
import com.danwalkercs.eight_bit_recipes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserSaveService {

    @Autowired
    private UserRepository userRepository;


    public User save(User user) {
        return userRepository.save(user);
    }
}
