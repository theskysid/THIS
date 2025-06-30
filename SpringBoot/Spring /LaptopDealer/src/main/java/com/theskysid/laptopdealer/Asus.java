package com.theskysid.laptopdealer;

public class Asus implements Brand {
    Processor processor;

//    //constructer injection
//    public Asus(Processor processor) {
//        this.processor = processor;
//    }

    //setter injection
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void showDetails() {
        System.out.println("You have selected Asus laptop" +   processor.showProcessorDetails());
    }
}
