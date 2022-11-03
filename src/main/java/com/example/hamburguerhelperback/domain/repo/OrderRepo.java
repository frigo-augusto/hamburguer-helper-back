package com.example.hamburguerhelperback.domain.repo;

import com.example.hamburguerhelperback.domain.entities.TesteOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.InvalidParameterException;
import java.util.Optional;

public interface OrderRepo extends JpaRepository<TesteOrder, Long> {
    Optional<TesteOrder> findByName(String name) throws InvalidParameterException;
}
