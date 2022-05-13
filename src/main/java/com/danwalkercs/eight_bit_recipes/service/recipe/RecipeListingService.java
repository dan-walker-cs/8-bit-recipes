package com.danwalkercs.eight_bit_recipes.service.recipe;

import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.repository.data.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecipeListingService {

    @Autowired
    private RecipeRepository recipeRepository;


    public List<Recipe> retrieveAllRecipes() {
        return recipeRepository.findAll();
    }
}
