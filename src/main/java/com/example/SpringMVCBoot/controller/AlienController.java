package com.example.SpringMVCBoot.controller;

import com.example.SpringMVCBoot.model.Alien;
import com.example.SpringMVCBoot.repo.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// use @RESTController - don't have to use @Controller and @ResponceBody

//@Controller
@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @GetMapping("aliens")
    // @ResponseBody
    public List<Alien> getAliens() {

        List<Alien> aliens = repo.findAll();

        return aliens;
    }

    @GetMapping("alien/{aid}")
    // @ResponseBody
    public Alien getAlien(@PathVariable("aid") int id){

        Alien a = repo.findById(id).orElse(new Alien(0, ""));

        return a;
    }

    @PostMapping("newAlien")
    public Alien addAlien(Alien alien) {
        repo.save(alien);
        return  alien;
    }
}
