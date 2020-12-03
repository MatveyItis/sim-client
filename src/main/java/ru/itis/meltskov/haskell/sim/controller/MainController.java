package ru.itis.meltskov.haskell.sim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/page")
    public String getMainPage() {
        return "main";
    }
}
