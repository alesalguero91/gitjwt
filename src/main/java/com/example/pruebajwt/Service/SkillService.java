/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebajwt.Service;

import com.example.pruebajwt.Interface.ISkillService;
import com.example.pruebajwt.Model.Skills;
import com.example.pruebajwt.Repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class SkillService implements ISkillService{
    @Autowired SkillRepository skillRepo;

    @Override
    public List<Skills> verSkills() {
        List<Skills>sk= skillRepo.findAll();
        return sk;
    }

    @Override
    public void crearSkill(Skills sk) {
        skillRepo.save(sk);
    }

    @Override
    public void borrarSkill(Long idSk) {
        skillRepo.deleteById(idSk);
    }

    @Override
    public Skills bucarSkill(Long idSk) {
        Skills sk = skillRepo.findById(idSk).orElse(null);
        return sk;
    }
    
    
    
}
