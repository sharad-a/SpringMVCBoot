package com.example.SpringMVCBoot.controller;

import com.example.SpringMVCBoot.model.Alien;
import com.example.SpringMVCBoot.repo.AlienRepo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    // using DAO layer
    @Autowired
    AlienRepo repo;

    // adding Model attribute data to returning page
    @ModelAttribute
    public void modelData(Model m) {
        m.addAttribute("name", "Aliens");
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("home page requested (index.jsp)");
        return "index";
    }

    // Servlet Type Method
    /*@RequestMapping("add")
    public String add(HttpServletRequest req) {
        System.out.println("result.jsp returned");

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int ans = num1 + num2;

        // method 1 to pass ans to result.jsp page
        // return "result.jsp?num3="+ans;

        // method 2 is to use session
        HttpSession session = req.getSession();
        session.setAttribute("answer", ans);

        return "result.jsp";

    }*/

    // Short method using @RequestParam and HttpSession
/*    @RequestMapping("add")
    public String add(@RequestParam("num1") int i,
                      @RequestParam("num2") int j,
                      HttpSession session) {
        int ans = i + j;

        session.setAttribute("answer", ans);

        return "result.jsp";

        // returning to same page
        // return "index.jsp";
    }*/

    // Passing values without HttpSession
    // Using ModelAndView
    /*@RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int i,
                            @RequestParam("num2") int j) {

*//*        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");*//*
        // setViewName() is for to return new page - don't use setView()

        ModelAndView mv = new ModelAndView("result");

        int ans = i + j;
        mv.addObject("answer", ans);

        return mv;
    }*/

    // sending only data using ModelMap or Model (both have different backend implementation)
/*    @RequestMapping("add")
    public String add(@RequestParam("num1") int i,
                      @RequestParam("num2") int j,
                      ModelMap m) {

        int ans = i + j;
        m.addAttribute("answer", ans);

        return "result";
    }*/

    // Model Attribute
/*    @RequestMapping("addAlien")
    public String addAlien(@RequestParam("aid") int id,
                           @RequestParam("aname") String name,
                           Model m) {

        Alien a = new Alien();
        a.setAid(id);
        a.setAname(name);

        m.addAttribute("alien", a);

        return "result";
    }*/

    // Receiving model attribute from client
/*    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien a,
                           Model m) {
        m.addAttribute("alien", a);

        return "result";
    }*/

    // Getting data using @GetMapping
/*    @GetMapping("getAliens")
    public String getAliens(Model m){
        List<Alien> aliens = Arrays.asList(new Alien(007, "Thala"), new Alien(033, "S. Raina"));
        m.addAttribute("result", aliens);

        return "showAliens";
    }

    // same as above
//    @RequestMapping(value="addAlien", method = RequestMethod.POST)
    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute("alien") Alien a) {

        return "result";
    }*/

    // using DAO layer
    @GetMapping("getAliens")
    public String getAliens(Model m) {
        m.addAttribute("result", repo.findAll());

        return "showAliens";
    }

    @RequestMapping("addAlien")
    public String addAlien(@RequestParam("aid") int id,
                           @RequestParam("aname") String name,
                           Model m) {

        Alien a = new Alien();
        a.setAid(id);
        a.setAname(name);

        m.addAttribute("alien", a);
        repo.save(a);

        return "result";
    }
}





















