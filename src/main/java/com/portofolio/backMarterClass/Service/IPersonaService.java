/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portofolio.backMarterClass.Service;

import com.portofolio.backMarterClass.Model.Persona;
import java.util.List;

/**
 *
 * @author Luis-W10-VM
 */
public interface IPersonaService {
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
    public void editarPersona(Persona per);
    
    
}
