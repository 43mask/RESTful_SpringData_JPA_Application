package com.restfull.application.rest_full_application.services;

import com.restfull.application.rest_full_application.models.Order;
import com.restfull.application.rest_full_application.models.User;
import com.restfull.application.rest_full_application.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findUserById(Long id) {
        return null;
    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public void save(Order order) {

    }
}
