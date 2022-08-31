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
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSk;
    
    private String herramienta;
    private int nivel;
    
    public Skills(){
        
    }

    public Skills(Long idSk, String herramienta, String logoSk, int nivel) {
        this.idSk = idSk;
        this.herramienta = herramienta;
        this.nivel = nivel;
    }  
}
