package com.danwalkercs.eight_bit_recipes.service;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.entity.rel.*;
import com.danwalkercs.eight_bit_recipes.exception.InvalidIdException;
import com.danwalkercs.eight_bit_recipes.repository.data.CuisineRepository;
import com.danwalkercs.eight_bit_recipes.repository.data.IngredientRepository;
import com.danwalkercs.eight_bit_recipes.repository.data.RecipeRepository;
import com.danwalkercs.eight_bit_recipes.repository.rel.RelCuisineRecipeRepository;
import com.danwalkercs.eight_bit_recipes.repository.rel.RelIngredientCuisineRepository;
import com.danwalkercs.eight_bit_recipes.repository.rel.RelIngredientRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class RelationshipService {

    @Autowired
    private RelCuisineRecipeRepository cuisineRecipeRepository;

    @Autowired
    private RelIngredientCuisineRepository ingredientCuisineRepository;

    @Autowired
    private RelIngredientRecipeRepository ingredientRecipeRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private CuisineRepository cuisineRepository;

    @Autowired
    private IngredientRepository ingredientRepository;


    // --------------------------------- //
    // RelCuisineRecipe
    // --------------------------------- //
    public List<Recipe> retrieveAllRecipesByCuisine(long cuisineId) {
        Cuisine target = cuisineRepository.findById(cuisineId)
                .orElseThrow(() -> new InvalidIdException(cuisineId));

        return cuisineRecipeRepository.findAllByCompositeKeyCuisine(target)
                .stream()
                .map(RelCuisineRecipe::getCompositeKey)
                .map(RelCuisineRecipeKey::getRecipe)
                .map(Recipe::getId)
                .map(rId -> recipeRepository.getById(rId))
                .collect(Collectors.toList());
    }

    public List<Cuisine> retrieveAllCuisinesByRecipe(long recipeId) {
        Recipe target = recipeRepository.findById(recipeId)
                .orElseThrow(() -> new InvalidIdException(recipeId));

        return cuisineRecipeRepository.findAllByCompositeKeyRecipe(target)
                .stream()
                .map(RelCuisineRecipe::getCompositeKey)
                .map(RelCuisineRecipeKey::getCuisine)
                .map(Cuisine::getId)
                .map(cId -> cuisineRepository.getById(cId))
                .collect(Collectors.toList());
    }

    // --------------------------------- //
    // RelIngredientCuisine
    // --------------------------------- //
    public List<Ingredient> retrieveAllIngredientsByCuisine(long cuisineId) {
        Cuisine target = cuisineRepository.findById(cuisineId)
                .orElseThrow(() -> new InvalidIdException(cuisineId));

        return ingredientCuisineRepository.findAllByCompositeKeyCuisine(target)
                .stream()
                .map(RelIngredientCuisine::getCompositeKey)
                .map(RelIngredientCuisineKey::getIngredient)
                .map(Ingredient::getId)
                .map(iId -> ingredientRepository.getById(iId))
                .collect(Collectors.toList());
    }

    public List<Cuisine> retrieveAllCuisinesByIngredient(long ingredientId) {
        Ingredient target = ingredientRepository.findById(ingredientId)
                .orElseThrow(() -> new InvalidIdException(ingredientId));

        return ingredientCuisineRepository.findAllByCompositeKeyIngredient(target)
                .stream()
                .map(RelIngredientCuisine::getCompositeKey)
                .map(RelIngredientCuisineKey::getCuisine)
                .map(Cuisine::getId)
                .map(cId -> cuisineRepository.getById(cId))
                .collect(Collectors.toList());
    }

    // --------------------------------- //
    // RelIngredientRecipe
    // --------------------------------- //
    public List<Ingredient> retrieveAllIngredientsByRecipe(long recipeId) {
        Recipe target = recipeRepository.findById(recipeId)
                .orElseThrow(() -> new InvalidIdException(recipeId));

        return ingredientRecipeRepository.findAllByCompositeKeyRecipe(target)
                .stream()
                .map(RelIngredientRecipe::getCompositeKey)
                .map(RelIngredientRecipeKey::getIngredient)
                .map(Ingredient::getId)
                .map(iId -> ingredientRepository.getById(iId))
                .collect(Collectors.toList());
    }

    public List<Recipe> retrieveAllRecipesByIngredient(long ingredientId) {
        Ingredient target = ingredientRepository.findById(ingredientId)
                .orElseThrow(() -> new InvalidIdException(ingredientId));

        return ingredientRecipeRepository.findAllByCompositeKeyIngredient(target)
                .stream()
                .map(RelIngredientRecipe::getCompositeKey)
                .map(RelIngredientRecipeKey::getRecipe)
                .map(Recipe::getId)
                .map(rId -> recipeRepository.getById(rId))
                .collect(Collectors.toList());
    }
}
