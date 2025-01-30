package com.javatutorial.part4;

public class Gauge {
    private int value;

    Gauge(){
        this.value = 0;
    }

    public void increase(){
        this.value = this.value+1;
    }

    public void decrease(){
        this.value--;
    }

    public int value(){
        return this.value;
    }

    public boolean full(){
        if (this.value!=5){
            return false;
        }
        return true;
    }


}
