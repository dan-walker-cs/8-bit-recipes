package com.danwalkercs.eight_bit_recipes.repository;

import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
