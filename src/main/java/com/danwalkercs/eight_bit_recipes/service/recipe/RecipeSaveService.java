package com.danwalkercs.eight_bit_recipes.service.recipe;

import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import com.danwalkercs.eight_bit_recipes.entity.data.User;
import com.danwalkercs.eight_bit_recipes.exception.UserNotFoundException;
import com.danwalkercs.eight_bit_recipes.repository.RecipeRepository;
import com.danwalkercs.eight_bit_recipes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RecipeSaveService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private UserRepository userRepository;


    public Recipe save(Recipe recipe) {
        String creatorName = recipe.getCreator().getName();

        User creator = validateUserName(creatorName);

        recipe.setCreator(creator);
        return recipeRepository.save(recipe);
    }

    // TODO: Does this belong in here, or a common utility?
    private User validateUserName(String name) {
        return Optional.ofNullable(userRepository.findByName(name))
                    .orElseThrow(() -> new UserNotFoundException("No user exists by username: " + name));
    }
}
