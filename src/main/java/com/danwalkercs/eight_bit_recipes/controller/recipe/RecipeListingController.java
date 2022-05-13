package com.danwalkercs.eight_bit_recipes.controller.recipe;

import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.service.recipe.RecipeListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/recipe/listing")
public class RecipeListingController {

    @Autowired
    private RecipeListingService recipeListingService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Recipe> listAllRecipes() {
        return recipeListingService.retrieveAllRecipes();
    }
}
