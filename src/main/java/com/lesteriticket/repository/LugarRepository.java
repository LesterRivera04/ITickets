
package com.lesteriticket.repository;

import com.lesteriticket.entity.Lugar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lester
 */
@Repository
public interface LugarRepository extends CrudRepository<Lugar,Long>{
    
}
