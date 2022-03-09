package com.lesteriticket.service;

import com.lesteriticket.entity.Historial;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lester
 */
@Repository
public interface IHistorialService {

    public List<Historial> getAllHistorial();
    public void saverHistorial(Historial historial);
    public Historial getHistorialById(long id);
    public void delete(long id);  
}
