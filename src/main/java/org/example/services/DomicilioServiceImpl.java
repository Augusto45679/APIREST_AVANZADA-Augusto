package org.example.services;

import org.example.entities.Domicilio;
import org.example.repositories.BaseRepository;
import org.example.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long>{

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baserepository) {
        super(baserepository);
    }
}
