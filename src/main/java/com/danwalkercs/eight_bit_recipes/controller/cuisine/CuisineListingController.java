package com.danwalkercs.eight_bit_recipes.controller.cuisine;

import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.service.cuisine.CuisineListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cuisine/listing")
public class CuisineListingController {

    @Autowired
    private CuisineListingService cuisineListingService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Cuisine> listAllCuisines() {
        return cuisineListingService.retrieveAllCuisines();
    }
}
