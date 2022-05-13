package com.danwalkercs.eight_bit_recipes.controller.recipe;

import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.service.recipe.RecipeSaveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/recipe")
public class RecipeSaveController {

    @Autowired
    private RecipeSaveService recipeSaveService;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Recipe saveRecipe(@RequestBody Recipe recipe) {
        return recipeSaveService.save(recipe);
    }
}
