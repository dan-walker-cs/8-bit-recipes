package com.danwalkercs.eight_bit_recipes.repository.rel;

import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.entity.data.User;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelUserRecipe;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelUserRecipeKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelUserRecipeRepository extends JpaRepository<RelUserRecipe, RelUserRecipeKey> {

    public List<RelUserRecipe> findAllByCompositeKeyUser(User user);
}
