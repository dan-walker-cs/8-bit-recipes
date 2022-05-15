package com.danwalkercs.eight_bit_recipes.entity.rel;

import com.danwalkercs.eight_bit_recipes.entity.data.Ingredient;
import com.danwalkercs.eight_bit_recipes.entity.data.Recipe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class RelIngredientRecipeKey implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ingredient_id", referencedColumnName = "id", nullable = false)
    private Ingredient ingredient;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id", nullable = false)
    private Recipe recipe;
}
