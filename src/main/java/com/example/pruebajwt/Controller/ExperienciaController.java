/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Controller;

import com.example.pruebajwt.Interface.IExperienciaService;
import com.example.pruebajwt.Model.Experiencia;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
public class ExperienciaController {
    @Autowired IExperienciaService iExpServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencia/crear")
    public void agregarExp(@RequestBody Experiencia exp){
        iExpServ.crearExp(exp);
    }
    
    @GetMapping("/experiencia/traer")
    @ResponseBody
    public List<Experiencia>verExperiencia(){
        return iExpServ.verExp();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencia/borrar/{idExp}")
    public void BorrarExperiencia(@PathVariable Long idExp){
        iExpServ.borrarExp(idExp);
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/experiencia/buscar/{idExp}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long idExp){
        return iExpServ.bucarExp(idExp);
    }
    

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("experiencia/editar/{idExp}")
    public Experiencia editarExperiencia(@PathVariable Long idExp, @RequestBody Experiencia Experiencia){
        Experiencia exp = iExpServ.bucarExp(idExp);
        
        exp.setEmpresa(Experiencia.getEmpresa());
        exp.setPuesto(Experiencia.getEmpresa());
        exp.setAnioIngExp(Experiencia.getAnioIngExp());
        exp.setAnioEgExp(Experiencia.getAnioEgExp());
        exp.setDescripcionExp(Experiencia.getDescripcionExp());
        
        iExpServ.crearExp(exp);
       return exp;
    }
    
    
    
}
