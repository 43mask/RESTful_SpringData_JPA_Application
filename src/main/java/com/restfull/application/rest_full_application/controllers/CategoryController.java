package com.restfull.application.rest_full_application.controllers;

import com.restfull.application.rest_full_application.models.Category;
import com.restfull.application.rest_full_application.models.Order;
import com.restfull.application.rest_full_application.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Controller
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/all")
    public List<Category> getAllProducts(){
        return categoryService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Category getProductById(@PathVariable Long id){
        return categoryService.findUserById(id);
    }


    @PostMapping(value = "/load")
    public void load(@RequestBody Category category){
        categoryService.save(category);
    }

    @PostMapping(value = "/delete")
    public void delete(@RequestBody Category category){
        categoryService.delete(category);
    }

}
