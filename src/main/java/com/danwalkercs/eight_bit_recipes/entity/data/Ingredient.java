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
public class Ingredient extends AbstractDomainEntity {

    private String name;
}
