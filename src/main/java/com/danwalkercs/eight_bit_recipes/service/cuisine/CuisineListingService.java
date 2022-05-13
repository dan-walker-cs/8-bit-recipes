package com.danwalkercs.eight_bit_recipes.service.cuisine;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.repository.CuisineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuisineListingService {

    @Autowired
    private CuisineRepository cuisineRepository;

    public List<Cuisine> retrieveAllCuisines() {
        return cuisineRepository.findAll();
    }
}
