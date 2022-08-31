/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Service;

import com.example.pruebajwt.Interface.IProyectoService;
import com.example.pruebajwt.Model.Proyectos;
import com.example.pruebajwt.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class ProyectoService implements IProyectoService{
    @Autowired ProyectoRepository proyectRepo;
    
    
    @Override
    public List<Proyectos> verPoyect() {
        List<Proyectos>pro = proyectRepo.findAll();
        return pro;
    }

    @Override
    public void crearProyect(Proyectos pro) {
        proyectRepo.save(pro);
    }

    @Override
    public void borrarProyect(Long idPro) {
        proyectRepo.deleteById(idPro);
    }

    @Override
    public Proyectos bucarProyect(Long idPro) {
        Proyectos pro = proyectRepo.findById(idPro).orElse(null);
        return pro;
    }
    
}
