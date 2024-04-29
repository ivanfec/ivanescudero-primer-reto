package com.litethinking.ivanescudero.primer.reto.domain;


public class Greeting {

    private String string;

    public Greeting() {
        super();
    }

    public Greeting(Person persona) {
        String name = persona.getName();
        this.string = String.format("Hola %s, bienvenido a Spring Boot", name);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


}
