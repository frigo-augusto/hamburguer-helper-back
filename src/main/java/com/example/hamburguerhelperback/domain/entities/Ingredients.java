package com.example.hamburguerhelperback.domain.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
public class Ingredients {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
}
