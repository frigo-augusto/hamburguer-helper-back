package com.example.hamburguerhelperback.controllers;

import com.example.hamburguerhelperback.domain.entities.Order;
import com.example.hamburguerhelperback.domain.repo.OrderRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
public class HelloWorldController{
    private OrderRepo orderRepo;

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello, World!";
    }

    @GetMapping("/get-orders")
    public List<Order> getOrders(){
        return orderRepo.findAll();
    }

    @GetMapping("/get-order-by-name")
    public Order getOrderByName(String name){
        return orderRepo.findByName(name).orElseThrow(InvalidParameterException::new);
    }
}