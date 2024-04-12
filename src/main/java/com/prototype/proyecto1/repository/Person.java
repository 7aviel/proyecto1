package com.prototype.proyecto1.repository;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public abstract class Person {

    @Id
    @Column(nullable = false)
    private Long DNI;
    private String name;
    private String surname;
    private String sex;
    private String address;
    private Integer phoneNumber;
    private String email;
    private String password;

}
