package com.litethinking.ivanescudero.primer.reto.service;

import com.litethinking.ivanescudero.primer.reto.domain.Person;
import com.litethinking.ivanescudero.primer.reto.domain.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public Greeting greet(Person persona){
        return new Greeting(persona);
    }

}
