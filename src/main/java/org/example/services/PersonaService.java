package org.example.services;

import org.example.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long> { //entonces este servicio nos queda por si queremos hacer otra implementacion de metodos q necesitemos

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    // boolean existsByDni(int dni);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
        // indexado ?1 para un parametro
    List<Persona> search(@Param("filtro") String filtro);

    //de esta manera hacemos la query con SQL
        @Query(
                value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
                nativeQuery = true
        )
        List<Persona> searchNativo(@Param("filtro")String filtro);
}
