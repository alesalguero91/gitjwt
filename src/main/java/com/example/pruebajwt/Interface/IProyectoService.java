/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Interface;

import com.example.pruebajwt.Model.Proyectos;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IProyectoService {
    public List<Proyectos> verPoyect();
    public void crearProyect(Proyectos pro);
    public void borrarProyect(Long idPro);
    public Proyectos bucarProyect(Long idPro);
}
