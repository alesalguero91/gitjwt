/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Service;

import com.example.pruebajwt.Interface.IExperienciaService;
import com.example.pruebajwt.Model.Experiencia;
import com.example.pruebajwt.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class ExperienciaService implements IExperienciaService {
@Autowired ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExp() {
        List<Experiencia> exp = expRepo.findAll();
        return exp;
    }

    @Override
    public void crearExp(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExp(Long idExp) {
        expRepo.deleteById(idExp);
    }

    @Override
    public Experiencia bucarExp(Long idExp) {
        Experiencia exp = expRepo.findById(idExp).orElse(null);
        return exp;
    }    
}
