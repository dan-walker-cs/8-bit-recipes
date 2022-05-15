package com.danwalkercs.eight_bit_recipes.repository.rel;

import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelIngredientRecipe;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelIngredientRecipeKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelIngredientRecipeRepository extends JpaRepository<RelIngredientRecipe, RelIngredientRecipeKey> {

    public List<RelIngredientRecipe> findAllByCompositeKeyRecipe(Recipe recipe);

    public List<RelIngredientRecipe> findAllByCompositeKeyIngredient(Ingredient ingredient);
}
