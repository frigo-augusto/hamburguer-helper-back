package com.example.hamburguerhelperback.domain.repo;

import com.example.hamburguerhelperback.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.InvalidParameterException;
import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order, Long> {
    Optional<Order> findByName(String name) throws InvalidParameterException;
}
