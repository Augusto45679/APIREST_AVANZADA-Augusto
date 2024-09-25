package org.example.repositories;

import org.example.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{ //patron DAO, separa la logica de negocio y se conecta con la data base

}
