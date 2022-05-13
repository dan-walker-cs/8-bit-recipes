package com.danwalkercs.eight_bit_recipes.repository;

import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
