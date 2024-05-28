package com.example.SpringMVCBoot.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("home page requested (index.jsp)");
        return "index.jsp";
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

    // Short method using @RequestParam
    @RequestMapping("add")
    public String add(@RequestParam("num1") int i,
                      @RequestParam("num2") int j,
                      HttpSession session) {
        int ans = i + j;

        session.setAttribute("answer", ans);

        return "result.jsp";

        // returning to same page
        // return "index.jsp";
    }
}
