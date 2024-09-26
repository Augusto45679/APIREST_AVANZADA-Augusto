package org.example.repositories;

import org.example.entities.Persona;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> { //patron DAO, separa la logica de negocio y se conecta con la data base

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
    // boolean existsByDni(int dni);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
        // indexado ?1 para un parametro
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
        // indexado ?1 para un parametro
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);


    // QUERIES NATIVAS
    //de esta manera hacemos la query con SQL
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro")String filtro);

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery = "SELECT COUNT(*) FROM persona",
            nativeQuery = true
    )
   Page<Persona> searchNativo(@Param("filtro")String filtro, Pageable pageable);
}
