package com.danwalkercs.eight_bit_recipes.service.ingredient;

import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import com.danwalkercs.eight_bit_recipes.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IngredientSaveService {

    @Autowired
    private IngredientRepository ingredientRepository;


    public Ingredient save(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }
}
