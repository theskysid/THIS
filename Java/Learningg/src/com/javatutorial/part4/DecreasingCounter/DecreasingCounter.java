package com.javatutorial.part4.DecreasingCounter;

public class DecreasingCounter {
    private int value;

    //constructor
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    //print value
    public void printValue(){
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (value > 0) {
            value = this.value - 1;
        }
    }
    public void reset(){
        value = 0;
    }


}
