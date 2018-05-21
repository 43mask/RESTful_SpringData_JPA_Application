package com.restfull.application.rest_full_application.services;

import com.restfull.application.rest_full_application.models.Order;
import com.restfull.application.rest_full_application.models.User;

import java.util.List;

public interface OrderService {

    Order findUserById(Long id);

    void delete(Order order);

    List<Order> findAll();

    void save(Order order);

}
