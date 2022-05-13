package com.danwalkercs.eight_bit_recipes.service.ingredient;

import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import com.danwalkercs.eight_bit_recipes.repository.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IngredientListingService {

    @Autowired
    private IngredientRepository ingredientRepository;


    public List<Ingredient> retrieveAllIngredients() {
        return ingredientRepository.findAll();
    }
}
