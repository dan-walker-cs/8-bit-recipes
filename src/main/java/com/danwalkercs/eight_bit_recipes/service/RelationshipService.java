package com.danwalkercs.eight_bit_recipes.service;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelCuisineRecipe;
import com.danwalkercs.eight_bit_recipes.entity.rel.RelCuisineRecipeKey;
import com.danwalkercs.eight_bit_recipes.exception.InvalidIdException;
import com.danwalkercs.eight_bit_recipes.repository.data.CuisineRepository;
import com.danwalkercs.eight_bit_recipes.repository.data.RecipeRepository;
import com.danwalkercs.eight_bit_recipes.repository.rel.RelCuisineRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class RelationshipService {

    @Autowired
    private RelCuisineRecipeRepository cuisineRecipeRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private CuisineRepository cuisineRepository;

    public List<Recipe> retrieveAllRecipesByCuisine(long cuisineId) {
        Cuisine target = cuisineRepository.findById(cuisineId)
                .orElseThrow(() -> new InvalidIdException(cuisineId));

        // TODO: try to break this, then add validation
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

        // TODO: try to break this, then add validation
        return cuisineRecipeRepository.findAllByCompositeKeyRecipe(target)
                .stream()
                .map(RelCuisineRecipe::getCompositeKey)
                .map(RelCuisineRecipeKey::getCuisine)
                .map(Cuisine::getId)
                .map(cId -> cuisineRepository.getById(cId))
                .collect(Collectors.toList());
    }
}
