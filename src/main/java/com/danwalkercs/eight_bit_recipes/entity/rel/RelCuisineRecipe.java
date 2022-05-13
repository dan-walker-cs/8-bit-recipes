package com.danwalkercs.eight_bit_recipes.entity.rel;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
@Data
public class RelCuisineRecipe {

    @EmbeddedId
    private RelCuisineRecipeKey compositeKey;

}
