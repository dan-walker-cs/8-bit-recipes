package com.danwalkercs.eight_bit_recipes.repository.rel;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelIngredientCuisine;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelIngredientCuisineKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelIngredientCuisineRepository extends JpaRepository<RelIngredientCuisine, RelIngredientCuisineKey> {

    public List<RelIngredientCuisine> findAllByCompositeKeyIngredient(Ingredient ingredient);

    public List<RelIngredientCuisine> findAllByCompositeKeyCuisine(Cuisine cuisine);
}
