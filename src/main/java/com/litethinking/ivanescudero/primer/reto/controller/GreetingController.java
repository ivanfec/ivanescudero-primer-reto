package com.litethinking.ivanescudero.primer.reto.controller;

import com.litethinking.ivanescudero.primer.reto.domain.Person;
import com.litethinking.ivanescudero.primer.reto.domain.Greeting;
import com.litethinking.ivanescudero.primer.reto.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @PostMapping("/hello")
    public @ResponseBody Greeting greet(@RequestBody Person persona){
        return greetingService.greet(persona);
    }

}
