package com.org.tcs.service;

import com.org.tcs.model.Hero;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface HeroService {
    public void createHero(Hero hero);

    public void updateHero(Hero hero);


    public List<Hero> getAll();
    /*public Optional<Hero> getById( Integer id);*/
    public Optional<Hero> getById( Integer id);

    public String deleteById( Integer id);
}