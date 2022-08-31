/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Interface;

import com.example.pruebajwt.Model.Idioma;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IIdiomaService {
    public List<Idioma> verLg();
    public void crearLg(Idioma lg);
    public void borrarLg(Long idLg);
    public Idioma bucarLg(Long idLg);
}
