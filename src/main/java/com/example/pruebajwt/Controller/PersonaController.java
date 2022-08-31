/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Controller;


import com.example.pruebajwt.Interface.IPersonaService;
import com.example.pruebajwt.Model.Persona;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired IPersonaService iPersonaService;
    
    @GetMapping("/persona/ver")
    @ResponseBody
    public List<Persona>verPersona(){
        return iPersonaService.verPersonas();
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/persona/crear")
    public void agregarPersona(@RequestBody Persona per){
        iPersonaService.crearPersona(per);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/eliminar/{id}")
    public void borrarPersona(@PathVariable Long id){
        iPersonaService.borrarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id, 
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg,
            @RequestParam("profesion") String nuevoProfesion,
            @RequestParam("categoria") String nuevoCategoria
            ){
        Persona persona= iPersonaService.bucarPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        persona.setProfesion(nuevoProfesion);
        persona.setCategoria(nuevoCategoria);
        
        iPersonaService.crearPersona(persona);
        return persona;   
    }
    @GetMapping("/persona/traer/perfil")
    public Persona findPersona(){
     return iPersonaService.bucarPersona((long)1);
    }
}

