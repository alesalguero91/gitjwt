/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Interface;

import com.example.pruebajwt.Model.Skills;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface ISkillService {
    public List<Skills> verSkills();
    public void crearSkill(Skills sk);
    public void borrarSkill(Long idSk);
    public Skills bucarSkill(Long idSk);
}
