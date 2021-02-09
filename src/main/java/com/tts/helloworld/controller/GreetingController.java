package com.tts.helloworld.controller;

import com.tts.helloworld.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


// add @Controller annotation
// below is a typical Controller class for thymeleaf
@Controller
public class GreetingController {


    //add @GetMapping annotation for /greeting
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "results";
    }

}

