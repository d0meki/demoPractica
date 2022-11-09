package com.practica.demopractica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.demopractica.interfaceService.IPersonaService;
//import com.practica.demopractica.interfaces.IPersona;
import com.practica.demopractica.model.Persona;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    //private IPersona data;

    @Override
    public List<Persona> listar() {
        Persona p = new Persona(1,"domeki","75054466");
        Persona p1 = new Persona(2,"reira","74839945");
        Persona p2 = new Persona(3,"emerson","72513909");
        Persona p3 = new Persona(4,"limber","79823647");
        Persona p4 = new Persona(5,"nicol","71923091");
        List<Persona> lista = new ArrayList<>();
        lista.add(p);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        return lista;
       // return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save(Persona p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }
    
   

}
