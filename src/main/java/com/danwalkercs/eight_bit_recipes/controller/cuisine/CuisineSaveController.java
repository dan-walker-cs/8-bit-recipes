package com.danwalkercs.eight_bit_recipes.controller.cuisine;


import com.danwalkercs.eight_bit_recipes.entity.data.Cuisine;
import com.danwalkercs.eight_bit_recipes.service.cuisine.CuisineSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuisine")
public class CuisineSaveController {

    @Autowired
    private CuisineSaveService cuisineSaveService;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Cuisine saveCuisine(@RequestBody Cuisine cuisine) {
        return cuisineSaveService.save(cuisine);
    }
}
