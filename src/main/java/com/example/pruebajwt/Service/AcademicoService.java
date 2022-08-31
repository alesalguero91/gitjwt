/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Service;

import com.example.pruebajwt.Interface.IAcademicoService;
import com.example.pruebajwt.Model.Academico;
import com.example.pruebajwt.Repository.AcademicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class AcademicoService implements IAcademicoService {
    @Autowired AcademicoRepository academicoRepo;

    @Override
    public List<Academico> verAc() {
        List<Academico>acad = academicoRepo.findAll();
        return acad;
    }

    @Override
    public void crearAc(Academico ac) {
        academicoRepo.save(ac);
    }

    @Override
    public void borrarAc(Long idAcad) {
        academicoRepo.deleteById(idAcad);
    }

    @Override
    public Academico bucarAc(Long idAcad) {
        Academico ac = academicoRepo.findById(idAcad).orElse(null);
        return ac;
    }
}

