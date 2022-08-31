/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Interface;

import com.example.pruebajwt.Model.Experiencia;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IExperienciaService {
   

    public List<Experiencia> verExp();

    public void crearExp(Experiencia exp);

    public void borrarExp(Long idExp);

    public Experiencia bucarExp(Long idExp);

}
    

