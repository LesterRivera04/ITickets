package com.lesteriticket.repository;

import com.lesteriticket.entity.Historial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lester
 */
@Repository
public interface HistorialRepository extends CrudRepository<Historial,Long>{
    
}
