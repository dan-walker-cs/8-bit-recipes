package com.danwalkercs.eight_bit_recipes.controller;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rel")
public class RelationshipController {


    @Autowired
    private RelationshipService relationshipService;


    @RequestMapping(value = "/listing/recipe/byCuisine/{cuisineId}", method = RequestMethod.GET)
    public List<Recipe> listAllRecipesByCuisine(@PathVariable(value = "cuisineId") long cuisineId) {
        return relationshipService.retrieveAllRecipesByCuisine(cuisineId);
    }

    @RequestMapping(value = "/listing/cuisine/byRecipe/{recipeId}", method = RequestMethod.GET)
    public List<Cuisine> listAllCuisinesByRecipe(@PathVariable(value = "recipeId") long recipeId) {
        return relationshipService.retrieveAllCuisinesByRecipe(recipeId);
    }
}
