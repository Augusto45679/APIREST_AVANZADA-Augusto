package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Table(name="Autor")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String biografia;

    @Builder.Default
    @ManyToMany(cascade = CascadeType.ALL) // las operaciones que se realicen sobre Autor afectar todos los libros asociados que tenga
    private List<Libro> libro = new ArrayList<>();


}
