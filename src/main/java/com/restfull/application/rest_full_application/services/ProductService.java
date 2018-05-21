package com.restfull.application.rest_full_application.services;

import com.restfull.application.rest_full_application.models.Product;
import com.restfull.application.rest_full_application.models.User;

import java.util.List;

public interface ProductService {

    Product findUserById(Long id);

    void delete(Product product);

    List<Product> findAll();

    void save(Product product);

}
