package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/vegetable")
public class VegetableController {
    private VegetableService vegetableService;

    @GetMapping
    public List<Vegetable> getByPriceAsc(){
        return vegetableService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public Vegetable getById(@PathVariable("id") Long id){
        return vegetableService.getById(id);
    }

    @GetMapping("/desc")
    public List<Vegetable> getByPriceDesc(){
        return vegetableService.getByPriceDesc();
    }

    @PostMapping
    public Vegetable save(@RequestBody Vegetable vegetable){
       return vegetableService.save(vegetable);
    }
    @PostMapping("/{name}")
    public List<Vegetable> searchByName(@PathVariable("name") String name){
       return vegetableService.searchByName(name);
    }
    @DeleteMapping("/{id}")
    public Vegetable delete(@PathVariable("id") Long id){
        Vegetable vegetable = vegetableService.getById(id);
        vegetableService.delete(vegetable);
        return vegetable;
    }
}
