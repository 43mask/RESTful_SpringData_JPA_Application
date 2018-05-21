package com.restfull.application.rest_full_application.controllers;

import com.restfull.application.rest_full_application.models.Product;
import com.restfull.application.rest_full_application.models.User;
import com.restfull.application.rest_full_application.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/all")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.findUserById(id);
    }


    @PostMapping(value = "/load")
    public void load(@RequestBody Product product){
        productService.save(product);
    }

    @PostMapping(value = "/delete")
    public void delete(@RequestBody Product product){
        productService.delete(product);
    }
}
