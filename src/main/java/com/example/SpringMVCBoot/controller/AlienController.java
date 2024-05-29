package com.example.SpringMVCBoot.controller;

import com.example.SpringMVCBoot.model.Alien;
import com.example.SpringMVCBoot.repo.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @GetMapping("aliens")
    @ResponseBody
    public List<Alien> aliens() {

        List<Alien> aliens = repo.findAll();

        return aliens;
    }
}
