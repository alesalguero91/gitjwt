/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author salguero
 */
@Entity
@Getter @Setter
public class Idioma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLg;
    
    private String lenguaje;
    private int oral;
    private int escrito;
    
    public Idioma(){
        
    }

    public Idioma(Long idLg, String lenguaje, int oral, int escrito) {
        this.idLg = idLg;
        this.lenguaje = lenguaje;
        this.oral = oral;
        this.escrito = escrito;
    }
    
    
    
    
}
