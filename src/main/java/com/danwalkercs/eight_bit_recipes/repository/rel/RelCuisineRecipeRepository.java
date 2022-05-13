package com.danwalkercs.eight_bit_recipes.repository.rel;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelCuisineRecipe;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelCuisineRecipeKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RelCuisineRecipeRepository extends JpaRepository<RelCuisineRecipe, RelCuisineRecipeKey> {

    public List<RelCuisineRecipe> findAllByCompositeKeyCuisine(Cuisine cuisine);

    public List<RelCuisineRecipe> findAllByCompositeKeyRecipe(Recipe recipe);
}
