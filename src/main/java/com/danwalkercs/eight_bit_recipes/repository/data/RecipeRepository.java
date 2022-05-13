package com.danwalkercs.eight_bit_recipes.repository.data;

import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
