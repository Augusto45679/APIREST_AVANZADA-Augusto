package org.example.services;

import org.example.entities.Persona;
import org.example.repositories.BaseRepository;
import org.example.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //notacion para indicar que es un servicio
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long>{
    
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baserepository) {
        super(baserepository);
    }

}
