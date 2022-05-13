package com.danwalkercs.eight_bit_recipes.controller.ingredient;


import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import com.danwalkercs.eight_bit_recipes.service.ingredient.IngredientSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
public class IngredientSaveController {

    @Autowired
    private IngredientSaveService ingredientSaveService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Ingredient saveIngredient(@RequestBody Ingredient ingredient) {
        return ingredientSaveService.save(ingredient);
    }
}
