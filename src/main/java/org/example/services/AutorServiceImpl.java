package org.example.services;

import org.example.entities.Autor;
import org.example.repositories.AutorRepository;
import org.example.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long>{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baserepository) {
        super(baserepository);
    }
}
