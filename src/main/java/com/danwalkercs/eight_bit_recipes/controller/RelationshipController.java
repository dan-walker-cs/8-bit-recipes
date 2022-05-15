package com.danwalkercs.eight_bit_recipes.controller;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/rel")
public class RelationshipController {


    @Autowired
    private RelationshipService relationshipService;


    // --------------------------------- //
    // RelCuisineRecipe
    // --------------------------------- //
    @RequestMapping(value = "/listing/recipe/byCuisine/{cuisineId}", method = RequestMethod.GET)
    public List<Recipe> listAllRecipesByCuisine(@PathVariable(value = "cuisineId") long cuisineId) {
        return relationshipService.retrieveAllRecipesByCuisine(cuisineId);
    }

    @RequestMapping(value = "/listing/cuisine/byRecipe/{recipeId}", method = RequestMethod.GET)
    public List<Cuisine> listAllCuisinesByRecipe(@PathVariable(value = "recipeId") long recipeId) {
        return relationshipService.retrieveAllCuisinesByRecipe(recipeId);
    }

    // --------------------------------- //
    // RelIngredientCuisine
    // --------------------------------- //
    @RequestMapping(value = "/listing/ingredient/byCuisine/{cuisineId}", method = RequestMethod.GET)
    public List<Ingredient> listAllIngredientsByCuisine(@PathVariable(value = "cuisineId") long cuisineId) {
        return relationshipService.retrieveAllIngredientsByCuisine(cuisineId);
    }

    @RequestMapping(value = "/listing/cuisine/byIngredient/{ingredientId}", method = RequestMethod.GET)
    public List<Cuisine> listAllCuisinesByIngredient(@PathVariable(value = "ingredientId") long ingredientId) {
        return relationshipService.retrieveAllCuisinesByIngredient(ingredientId);
    }

    // --------------------------------- //
    // RelIngredientRecipe
    // --------------------------------- //
    @RequestMapping(value = "/listing/ingredient/byRecipe/{recipeId}", method = RequestMethod.GET)
    public List<Ingredient> listAllIngredientsByRecipe(@PathVariable(value = "recipeId") long recipeId) {
        return relationshipService.retrieveAllIngredientsByRecipe(recipeId);
    }

    @RequestMapping(value = "/listing/recipe/byIngredient/{ingredientId}", method = RequestMethod.GET)
    public List<Recipe> listAllRecipesByIngredient(@PathVariable(value = "ingredientId") long ingredientId) {
        return relationshipService.retrieveAllRecipesByIngredient(ingredientId);
    }

    // --------------------------------- //
    // RelUserIngredient
    // --------------------------------- //
    @RequestMapping(value = "/listing/ingredient/byUser/{userId}", method = RequestMethod.GET)
    public List<Ingredient> listAllIngredientsByUser(@PathVariable(value = "userId") long userId) {
        return relationshipService.retrieveAllIngredientsByUser(userId);
    }

    // --------------------------------- //
    // RelUserRecipe
    // --------------------------------- //
    @RequestMapping(value = "/listing/recipe/byUser/{userId}", method = RequestMethod.GET)
    public List<Recipe> listAllRecipesByUser(@PathVariable(value = "userId") long userId) {
        return relationshipService.retrieveAllRecipesByUser(userId);
    }
}
