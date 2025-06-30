package com.theskysid.laptopdealer;

public class Hp implements Brand {
    Processor processor;

    //constructer injection
    public Hp(Processor processor) {
        this.processor = processor;
    }

    public void showDetails() {
        System.out.println("You have selected HP laptop" +  processor.showProcessorDetails());
    }
}
