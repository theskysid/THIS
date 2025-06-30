package com.theskysid.laptopdealer;

public class Dell implements Brand {

    Processor processor;

    //constructer injection
    public Dell(Processor processor) {
        this.processor = processor;
    }

    public void showDetails() {
        System.out.println("You have selected Dell laptop" +  processor.showProcessorDetails());
    }
}
