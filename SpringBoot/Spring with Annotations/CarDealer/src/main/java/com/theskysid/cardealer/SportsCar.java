package com.theskysid.cardealer;

import org.springframework.stereotype.Component;

@Component("sports")
public class SportsCar implements Car {
    @Override
    public void defaultmessage() {
        System.out.println("You bought a sports car!");
    }
}
