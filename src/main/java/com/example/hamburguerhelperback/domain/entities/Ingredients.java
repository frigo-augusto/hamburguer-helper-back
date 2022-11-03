package com.example.hamburguerhelperback.domain.entities;

import javax.persistence.*;

@Entity
@Table
public class Ingredients {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
}
