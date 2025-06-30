package com.theskysid.cardealer;

import org.springframework.stereotype.Component;

@Component("cyber")
public class CyberTruck implements Car{

    @Override
    public void defaultmessage(){
        System.out.println("You bought a cyber truck car!");
    }
}
