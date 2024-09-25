package org.example.services;

import org.example.entities.Localidad;
import org.example.repositories.BaseRepository;
import org.example.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long>{

    @Autowired
    private LocalidadRepository Localidadrepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baserepository) {
        super(baserepository);
    }
}
