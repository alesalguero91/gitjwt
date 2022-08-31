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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String img;
    private String profesion;
    private String categoria;
    
    public Persona(){
        
    }

    public Persona(Long id, String nombre, String apellido, String img, String profesion, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.profesion = profesion;
        this.categoria = categoria;
    }

}
