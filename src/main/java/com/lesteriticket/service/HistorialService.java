package com.lesteriticket.service;

import com.lesteriticket.entity.Historial;
import com.lesteriticket.repository.HistorialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lester
 */
@Service
public class HistorialService implements IHistorialService{
    @Autowired
    private HistorialRepository historialRepository;

    @Override
    public List<Historial> getAllHistorial() {
        return (List<Historial>)historialRepository.findAll();
    }

    @Override
    public void saverHistorial(Historial historial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Historial getHistorialById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(long id) {
        historialRepository.deleteById(id);
    }
    
}
