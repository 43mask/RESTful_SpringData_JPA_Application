package com.restfull.application.rest_full_application.controllers;

import com.restfull.application.rest_full_application.models.Order;
import com.restfull.application.rest_full_application.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/all")
    public List<Order> getAllProducts(){
        return orderService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Order getProductById(@PathVariable Long id){
        return orderService.findUserById(id);
    }


    @PostMapping(value = "/load")
    public void load(@RequestBody Order order){
        orderService.save(order);
    }

    @PostMapping(value = "/delete")
    public void delete(@RequestBody Order order){
        orderService.delete(order);
    }
}
