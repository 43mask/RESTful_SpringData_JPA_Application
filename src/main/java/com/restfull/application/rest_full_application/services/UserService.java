package com.restfull.application.rest_full_application.services;

import com.restfull.application.rest_full_application.models.User;

import java.util.List;

public interface UserService {

    User findUserById(Long id);

    void delete(User user);

    List<User> findAll();

    void save(User user);

}
