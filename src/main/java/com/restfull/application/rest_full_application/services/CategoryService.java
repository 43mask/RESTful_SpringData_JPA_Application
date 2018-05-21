package com.restfull.application.rest_full_application.services;

import com.restfull.application.rest_full_application.models.Category;
import com.restfull.application.rest_full_application.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    Category findUserById(Long id);

    void delete(Category category);

    List<Category> findAll();

    void save(Category category);

}
