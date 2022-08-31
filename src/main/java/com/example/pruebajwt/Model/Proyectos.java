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
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPro;
    
    private String nombre;
    private String descripcion;
    private String img;
    
    public Proyectos(){
        
    }

    public Proyectos(Long idPro, String nombre, String descripcion, String img) {
        this.idPro = idPro;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
    }
    
    
}
