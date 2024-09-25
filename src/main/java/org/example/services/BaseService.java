package org.example.services;

import java.util.List;

public interface BaseService<E> { //metodos principales, con operaciones principales
    public List<E> findAll() throws Exception; //nos trae una lista de la entidad en la base de dato
    public E findById(Long id) throws  Exception;
    public E save(E entity) throws Exception;
    public E update(Long id,E entity) throws Exception;
    public boolean delete(Long id) throws  Exception;
}
