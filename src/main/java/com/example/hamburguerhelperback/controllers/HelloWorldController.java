package com.example.hamburguerhelperback.controllers;

import com.example.hamburguerhelperback.domain.entities.TesteOrder;
import com.example.hamburguerhelperback.domain.repo.OrderRepo;
import com.example.hamburguerhelperback.dto.ExampleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class HelloWorldController{
    @Autowired
    private OrderRepo orderRepo;

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello, World!";
    }

    @GetMapping("/get-orders")
    public List<TesteOrder> getOrders(){
        return orderRepo.findAll();
    }

    @GetMapping("/get-order-by-name")
    public TesteOrder getOrderByName(String name){
        return orderRepo
                .findByName(name)
                .orElseThrow(InvalidParameterException::new);
    }

    @PostMapping("/insert-order")
    public void insertOrder(@RequestParam String name){
        TesteOrder order = new TesteOrder();
        order.setName(name);
        order.setDescription("batata");
        orderRepo.save(order);
        System.out.println(name);
    }

    @PostMapping("/print-example-dto")
    public void printExampleDto(@RequestBody ExampleDto exampleDto){
        System.out.println(exampleDto.toString());
        System.out.println(exampleDto.getName());
    }
}