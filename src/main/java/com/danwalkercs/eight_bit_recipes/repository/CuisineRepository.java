package com.danwalkercs.eight_bit_recipes.repository;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CuisineRepository extends JpaRepository<Cuisine, Long> {
}
