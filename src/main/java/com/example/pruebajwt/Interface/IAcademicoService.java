/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Interface;

import com.example.pruebajwt.Model.Academico;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IAcademicoService {
    public List<Academico> verAc();
    public void crearAc(Academico ac);
    public void borrarAc(Long idAcad);
    public Academico bucarAc(Long idAcad);
}
