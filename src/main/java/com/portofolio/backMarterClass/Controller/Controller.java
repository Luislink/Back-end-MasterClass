/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portofolio.backMarterClass.Controller;

import com.portofolio.backMarterClass.Model.Persona;
import com.portofolio.backMarterClass.Service.IPersonaService;
//import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis-W10-VM
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
    /*
    List<Persona> listapersona = new ArrayList();
    
    @GetMapping("/hola")
    public String decirHola(){
    return "Hola Mundo";
    }
    */
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/personas/crear")
    public void agregarPersona(@RequestBody Persona pers){
    //listapersona.add(pers);
    persoServ.crearPersona(pers);
    }
    
    @GetMapping("/personas/traer")
    @ResponseBody
    public List<Persona> verPersonas(){
    //return listapersona;
    return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    @PutMapping("/editar/{id}")
    public void editarPersona(@RequestBody Persona per){
    persoServ.editarPersona(per);
    }
    @GetMapping("/personas/traer/perfil")
    @ResponseBody
    public Persona buscarPersona(){
    return persoServ.buscarPersona((long)1 );
    }
 }
