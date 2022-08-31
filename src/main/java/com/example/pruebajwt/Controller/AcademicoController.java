/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Controller;


import com.example.pruebajwt.Interface.IAcademicoService;
import com.example.pruebajwt.Model.Academico;
import com.example.pruebajwt.Model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salguero
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AcademicoController {
    @Autowired IAcademicoService iAcadServ;
    
    @PostMapping("/academico/crear")
    public void agregarAcad(@RequestBody Academico ac){
        iAcadServ.crearAc(ac);
    }
    
    @GetMapping("/academico/traer")
    @ResponseBody
    public List<Academico>verAcad(){
        return iAcadServ.verAc();
    }
    
    @GetMapping("/academico/buscar/{idAcad}")
    @ResponseBody
    public Academico buscarAcademico(@PathVariable Long idAcad){
        return iAcadServ.bucarAc(idAcad);
    }
    
    
    
    @DeleteMapping("/academico/borrar/{idAcad}")
    public void borrarAc(@PathVariable Long idAcad){
        iAcadServ.borrarAc(idAcad);
    }
    
    
    @PutMapping("/academico/editar/{idAcad}")
    public Academico editarAcademico(@PathVariable Long idAcad, @RequestBody Academico academico){
        Academico ac = iAcadServ.bucarAc(idAcad);
        
        ac.setTitAcad(academico.getTitAcad());
        ac.setEstablecimientoAcad(academico.getEstablecimientoAcad());
        ac.setAnioIngresoAcad(academico.getAnioIngresoAcad());
        ac.setAnioEgresoAcad(academico.getAnioEgresoAcad());
        ac.setPromedio(academico.getPromedio());
        
        iAcadServ.crearAc(ac);
        return ac;
    }
    
}
