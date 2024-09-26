package org.example.services;

import org.example.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long> { //entonces este servicio nos queda por si queremos hacer otra implementacion de metodos q necesitemos

    List<Persona> search(String filtro)throws Exception;
    Page<Persona> search(String filtro, Pageable pageable)throws Exception;
}
