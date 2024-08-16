package com.samsung.jpademo.repositories.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname", length = 120, nullable = false)
    private String name;

    @Column(columnDefinition = "bit default 0") //Cách 1
    @ColumnDefault("false") //Caách 2
    private Boolean gender;
    @Column(length = 150)
    private String email;
}
