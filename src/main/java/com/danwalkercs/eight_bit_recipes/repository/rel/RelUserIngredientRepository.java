package com.danwalkercs.eight_bit_recipes.repository.rel;

import com.danwalkercs.eight_bit_recipes.entity.data.User;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelIngredientRecipeKey;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelUserIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelUserIngredientRepository extends JpaRepository<RelUserIngredient, RelIngredientRecipeKey> {

    public List<RelUserIngredient> findAllByCompositeKeyUser(User user);
}
