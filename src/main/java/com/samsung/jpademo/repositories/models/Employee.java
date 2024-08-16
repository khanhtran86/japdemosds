package com.samsung.jpademo.repositories.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;

@Entity
@Table(name = "employees")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname", length = 120, nullable = false)
    private String name;

    //@Column(columnDefinition = "bit default 0") //Cách 1
    @ColumnDefault("0") //Caách 2
    private Boolean gender;
    @Column(length = 150)
    private String email;
}
