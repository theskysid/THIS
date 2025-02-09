package com.sid.simplewebapp.repo;

import com.sid.simplewebapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Integer> {

}
