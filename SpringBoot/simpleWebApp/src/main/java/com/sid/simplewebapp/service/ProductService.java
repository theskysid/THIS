package com.sid.simplewebapp.service;

import com.sid.simplewebapp.model.Product;
import com.sid.simplewebapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    //dont need now because connecting the db here....
//    List<Product> products = new ArrayList<>(List.of( // Using ArrayList for mutability
//            new Product(101, "iPhone", 50000),
//            new Product(102, "iPhone 15", 60000)
//    ));

    public List<Product> getProducts() {

        return repo.findAll();
    }


    public Product getProductById(int prodId) { // Fixed method name

        return repo.findById(prodId).orElse(new Product());



        //this is the part when not using the Spring DATA JPA
        //        return products.stream()
//                .filter(product -> product.getProdId() == prodId)
//                .findFirst()
//                //.orElse(null); // Using Stream API for cleaner code
//                .orElse(new Product(100,"No item found", 0)); //just used for clarification that the code is working in else part also
    }

    public void addProduct(Product prod) {

        repo.save(prod);

        //products.add(prod);
    }


    public void updateProduct(Product prod) {

        repo.save(prod);

        //without spring data jpa
        //        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prod.getProdId()) {
//                index = i;
//            }
//        }
//        products.set(index, prod);

    }

    public void deleteProduct(int prodId) {

        repo.deleteById(prodId);

        //without spring data jpa

        //think about the logic yourself
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prodId) {
//                index = i;
//            }
//        }
//        products.remove(index);
    }
}
