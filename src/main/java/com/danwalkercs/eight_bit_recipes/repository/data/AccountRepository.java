package com.danwalkercs.eight_bit_recipes.repository.data;

import com.danwalkercs.eight_bit_recipes.entity.data.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Long> {
}
