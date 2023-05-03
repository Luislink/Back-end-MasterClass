/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portofolio.backMarterClass.Service;

import com.portofolio.backMarterClass.Model.Persona;
import com.portofolio.backMarterClass.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luis-W10-VM
 */
@Service
public class PersonaService implements IPersonaService{
    @Autowired
    public PersonaRepository persoRepo;
            
    @Override
    public List<Persona> verPersonas() {
      return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
     persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
         Persona persona = persoRepo.findById(id).orElse(null);
         return persona;
    }

    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
    }
    
}
