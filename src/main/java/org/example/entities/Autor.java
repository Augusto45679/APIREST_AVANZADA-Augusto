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

}
