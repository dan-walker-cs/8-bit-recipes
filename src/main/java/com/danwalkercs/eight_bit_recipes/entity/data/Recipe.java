package com.danwalkercs.eight_bit_recipes.entity.data;

import com.danwalkercs.eight_bit_recipes.entity.AbstractDomainEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Recipe extends AbstractDomainEntity {

    private String name;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "creator", referencedColumnName = "name", nullable = false)
    private User creator;
}
