package com.lesteriticket.controller;

import com.lesteriticket.entity.Historial;
import com.lesteriticket.service.IHistorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HistorialController {
    @Autowired
    private IHistorialService historialService;
    
    @GetMapping({"/"})
    public String index(){
        return "historial";
    }
    
    @GetMapping("/historial")
    public String index(Model model){
        List<Historial> listaHistorial=historialService.getAllHistorial();
        model.addAttribute("titulo","Historial");
        model.addAttribute("historial",listaHistorial);
        return "historial";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarArtista(@PathVariable ("id") Long idHistorial){
        historialService.delete(idHistorial);
        return "redirect:/historial";
    }
}
