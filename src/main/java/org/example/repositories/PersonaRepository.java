package org.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{ //patron DAO, separa la logica de negocio y se conecta con la data base

}
