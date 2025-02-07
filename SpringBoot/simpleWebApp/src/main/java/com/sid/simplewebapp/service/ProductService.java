package com.sid.simplewebapp.service;

import com.sid.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(List.of( // Using ArrayList for mutability
            new Product(101, "iPhone", 50000),
            new Product(102, "iPhone 15", 60000)
    ));

    public List<Product> getProducts() {
        return products;
    }


    public Product getProductById(int prodId) { // Fixed method name
        return products.stream()
                .filter(product -> product.getProdId() == prodId)
                .findFirst()
                //.orElse(null); // Using Stream API for cleaner code
                .orElse(new Product(100,"No item found", 0)); //just used for clarification that the code is working in else part also
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }


}
