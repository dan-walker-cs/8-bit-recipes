package com.danwalkercs.eight_bit_recipes.entity.data;

import com.danwalkercs.eight_bit_recipes.entity.AbstractDomainEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Recipe extends AbstractDomainEntity {

    private String creator;

    // TODO: This will be its own object
    private String directions;
}
