/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Controller;


import com.example.pruebajwt.Interface.ISkillService;
import com.example.pruebajwt.Model.Skills;
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
public class SkillController {
    @Autowired ISkillService iSkServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/skill/crear")
    public void agregarSkill(@RequestBody Skills sk){
        iSkServ.crearSkill(sk);
    }
    
    @GetMapping("/skill/traer")
    @ResponseBody
    public List<Skills>verSkills(){
        return iSkServ.verSkills();
    }
    
    @GetMapping("/skill/buscar/{idSk}")
    @ResponseBody
    public Skills buscarSkill(@PathVariable Long idSk){
        Skills sk = iSkServ.bucarSkill(idSk);
        return sk;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/skill/borrar/{idSk}")
    public void borrarSk(@PathVariable Long idSk){
        iSkServ.borrarSkill(idSk);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/skill/editar/{idSk}")
    public Skills editarSkill(@PathVariable Long idSk, @RequestBody Skills skill){
        Skills sk = iSkServ.bucarSkill(idSk);
        
        sk.setHerramienta(skill.getHerramienta());
        sk.setNivel(skill.getNivel());
        
        iSkServ.crearSkill(sk);
        return sk;
        
    }
    
    
}
