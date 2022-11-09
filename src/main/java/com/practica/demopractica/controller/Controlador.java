package com.practica.demopractica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica.demopractica.interfaceService.IPersonaService;
import com.practica.demopractica.model.Persona;
import java.util.*;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IPersonaService service;
    @GetMapping("/listar")
    public List<Persona> Listar(Model model){
        List<Persona>personas = service.listar();
        return personas;
    }
    @GetMapping("/holamundo")
    public String holamundo(){
        return "Hola mundo";
    }
}
