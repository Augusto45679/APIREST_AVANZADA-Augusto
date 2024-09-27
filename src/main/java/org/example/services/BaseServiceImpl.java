package org.example.services;

import jakarta.transaction.Transactional;
import org.example.entities.Base;
import org.example.repositories.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E,ID> Baserepository;

    public BaseServiceImpl(BaseRepository<E, ID> baserepository) {
        Baserepository = baserepository;
    }
    @Override
    @Transactional //con esto nos ahorramos hacer el em.GetTransaction().Begin() y el commit, etc....
    public List<E> findAll() throws Exception {

        try {
            List<E> entities = Baserepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entitiyOptional = Baserepository.findById(id); // Optional pq no sabemos si ese ID esta en la Base de Datos
            return entitiyOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = Baserepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = Baserepository.findById(id);
            E entityUpdate  = entityOptional.get();
            entityUpdate  = Baserepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if(Baserepository.existsById(id)){
                Baserepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception{
        try {
           Page<E> entities = Baserepository.findAll((org.springframework.data.domain.Pageable) pageable);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
