package org.example.repositories;


import org.example.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.awt.print.Pageable;
import java.io.Serializable;


@NoRepositoryBean // de esta interface no se crean instancias
public interface BaseRepository<E extends Base,ID extends Serializable> extends JpaRepository<E, ID> {
}
