/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Controller;

import com.example.pruebajwt.Interface.IIdiomaService;
import com.example.pruebajwt.Model.Idioma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salguero
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IdiomaController {
    @Autowired IIdiomaService idiomaServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/idioma/crear")
    public void agregarLg(@RequestBody Idioma lg){
        idiomaServ.crearLg(lg);
    }
    
    @GetMapping("/idioma/traer")
    @ResponseBody
    public List<Idioma>verLg(){
        return idiomaServ.verLg();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/idioma/borrar/{idLg}")
    public void BorrarIdioma(@PathVariable Long idLg){
        idiomaServ.borrarLg(idLg);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/idioma/buscar/{idLg}")
    @ResponseBody
    public Idioma buscarIdioma(@PathVariable Long idLg){
        return idiomaServ.bucarLg(idLg);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("idioma/editar/{idLg}")
    public Idioma editarIdioma(@PathVariable Long idLg, @RequestBody Idioma idioma){
        Idioma lg = idiomaServ.bucarLg(idLg);
        
        lg.setLenguaje(idioma.getLenguaje());
        lg.setEscrito(idioma.getEscrito());
        lg.setOral(idioma.getOral());
        
        idiomaServ.crearLg(lg);
        return lg;
    }
    
}
