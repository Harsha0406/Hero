package com.org.tcs.service;

import com.org.tcs.model.Hero;
import com.org.tcs.repository.HeroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    HeroRepo heroRepo;
    @Override
    public void createHero(Hero hero) {
        heroRepo.save(hero);
    }
    @Override
    public void updateHero(Hero hero) {
        heroRepo.save(hero);

    }

    @Override
    public List<Hero> getAll() {
       List<Hero> rr= heroRepo.findAll();
        return rr;
    }

    @Override
    public Optional<Hero> getById(Integer id) {
       Optional<Hero> optional= heroRepo.findById(id);
        return optional;
    }


    @Override
    public String deleteById(Integer id) {
       heroRepo.deleteById(id);
        return null;

    }

   /* @Override
    public Optional<Hero> getById(Integer id) {
        return Optional.empty();
    }*/

}

