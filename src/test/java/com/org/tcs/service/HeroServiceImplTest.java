package com.org.tcs.service;

import com.org.tcs.model.Hero;
import com.org.tcs.repository.HeroRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HeroServiceImplTest {
    @InjectMocks
    private HeroServiceImpl heroServiceImpl;
    @Mock
    private HeroRepo heroRepo;

    @Test
    void createHero() {
        Hero hero=new Hero();
        hero.setId(100);
        hero.setName("Harsha");
        hero.setAddress("Vizag");
        heroServiceImpl.createHero(hero);
        Mockito.verify(heroRepo,Mockito.times(1)).save(hero);
    }

    @Test
    void updateHero() {
        Hero hero=new Hero();
        hero.setId(100);
        hero.setName("Harsha");
        hero.setAddress("Vizag");
        heroServiceImpl.updateHero(hero);
        Mockito.verify(heroRepo,Mockito.times(1)).save(hero);
    }

    @Test
    void getAll() {

    }

    @Test
    void getById() {
    }

    @Test
    void deleteById() {
    }
}