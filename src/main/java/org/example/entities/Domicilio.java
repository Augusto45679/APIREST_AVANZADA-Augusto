package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Domicilio extends Base{

    private String calle;
    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Persona persona;


    @OneToMany(mappedBy = "domicilio")
    private Set<Localidad> localidades;

}