package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VegetableServiceImpl implements VegetableService{

    private VegetableRepository vegetableRepository;

    @Override
    public List<Vegetable> getByPriceAsc() {
        return vegetableRepository.getByPriceAsc();
    }

    @Override
    public List<Vegetable> getByPriceDesc() {
        return vegetableRepository.getByPriceDesc();
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.searchByName(name);
    }

    @Override
    public Vegetable getById(Long id) {
        return vegetableRepository.findById(id).orElse(null);
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public Vegetable delete(Vegetable vegetable) {
        vegetableRepository.delete(vegetable);
        return vegetable;
    }
}
