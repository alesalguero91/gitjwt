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
public class Academico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAcad;
    
    private String titAcad;
    private String establecimientoAcad;
    private String anioIngresoAcad;
    private String anioEgresoAcad;
    private String promedio;
    
    public Academico(){
        
    }

    public Academico(Long idAcad, String titAcad, String establecimientoAcad, String anioIngresoAcad, String anioEgresoAcad, String promedio) {
        this.idAcad = idAcad;
        this.titAcad = titAcad;
        this.establecimientoAcad = establecimientoAcad;
        this.anioIngresoAcad = anioIngresoAcad;
        this.anioEgresoAcad = anioEgresoAcad;
        this.promedio = promedio;
        
    }
    
}
