package com.prototype.proyecto1.repository;

import com.prototype.proyecto1.enumerated.Rol;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Teacher extends Person {

    private Integer legajo;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)//Do not forget to add the bidirectional relatioship
    private List<Materias> materiasList;
    private Rol PROFESOR;
}
