package com.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping({ "/", "/welcome" })
    public final String welcome(
        @RequestParam(
            name = "nombre",
            required = false,
            defaultValue = "Mundo"
        ) final String nombre,
        final Model model
    ) {
        model.addAttribute("nombre", nombre);
        return "index";
    }
}
