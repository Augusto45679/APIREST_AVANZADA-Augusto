package org.example.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Table(name="Autor")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Audited
public class Autor extends Base{

    private String nombre;
    private String apellido;
    @Column(name = "Biografia",length = 1500)
    private String biografia;

    @Builder.Default
    @ManyToMany(cascade = CascadeType.ALL) // las operaciones que se realicen sobre Autor afectar todos los libros asociados que tenga
    private List<Libro> libro = new ArrayList<>();


}
