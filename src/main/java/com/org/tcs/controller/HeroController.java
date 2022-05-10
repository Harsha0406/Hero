package com.org.tcs.controller;

import com.org.tcs.model.Hero;
import com.org.tcs.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HeroController {
    @Autowired
    HeroService heroService;

    @PostMapping("/create")
    public void createHero(@RequestBody Hero hero) {
        heroService.createHero(hero);

    }

    @PutMapping("/update")
    public void updateHero(@RequestBody Hero hero) {
        heroService.updateHero(hero);
    }

    @GetMapping("/getAll")
    public List<Hero> getAll() {
        List<Hero> rr = heroService.getAll();

        return rr;
    }

    /*@GetMapping("/getById/{id}")
    public Optional<Hero> getById(@PathVariable Integer id){
        Optional<Hero>ss=heroService.getById(id);
        return ss;
    }*/
    @GetMapping ("/getById/{id}")
    public Optional<Hero> getById(@PathVariable Integer id){
        Optional<Hero> hero=heroService.getById(id);

        return  hero;

    }


    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
       String rr= heroService.deleteById(id);
        return "update";
    }
}
