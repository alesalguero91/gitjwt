/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Service;


import com.example.pruebajwt.Interface.IIdiomaService;
import com.example.pruebajwt.Model.Idioma;
import com.example.pruebajwt.Repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class IdiomaService implements IIdiomaService {
    @Autowired IdiomaRepository idiomaRepo;

    @Override
    public List<Idioma> verLg() {
        List<Idioma>lg = idiomaRepo.findAll();
        return lg;
    }

    @Override
    public void crearLg(Idioma lg) {
        idiomaRepo.save(lg);
    }

    @Override
    public void borrarLg(Long idLg) {
        idiomaRepo.deleteById(idLg);
    }

    @Override
    public Idioma bucarLg(Long idLg) {
        Idioma lg = idiomaRepo.findById(idLg).orElse(null);
        return lg;
    }
    
}
