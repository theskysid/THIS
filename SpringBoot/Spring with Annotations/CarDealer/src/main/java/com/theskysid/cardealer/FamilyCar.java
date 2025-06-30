package com.theskysid.cardealer;

import org.springframework.stereotype.Component;

@Component("family")
public class FamilyCar implements Car {
    @Override
    public void defaultmessage() {
        System.out.println("You bought a family car!");
    }
}
