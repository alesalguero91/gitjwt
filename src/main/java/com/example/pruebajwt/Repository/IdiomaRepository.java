/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Repository;

import com.example.pruebajwt.Model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author salguero
 */

@Repository
public interface IdiomaRepository  extends JpaRepository <Idioma, Long> {
    
}
