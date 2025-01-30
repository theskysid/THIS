package com.javatutorial.part4;

public class Product {
    String initialName;
    double initialPrice;
    int initialQuantity;

    Product(String initialName, double initialPrice, int initialQuantity){
        this.initialName =initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }

    public void printProduct(){
        System.out.println(this.initialName+", price "+this.initialPrice+", "+initialQuantity+" pcs");
    }

    public static void main(String[] args) {
        Product p1 = new Product("Banana",1.1, 13);
        p1.printProduct();
    }
}
