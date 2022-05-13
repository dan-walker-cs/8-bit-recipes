package com.danwalkercs.eight_bit_recipes.repository.data;

import com.danwalkercs.eight_bit_recipes.entity.data.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    public User findByName(String name);
}
