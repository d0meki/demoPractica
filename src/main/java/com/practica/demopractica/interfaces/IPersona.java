package com.practica.demopractica.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practica.demopractica.model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer>{
    
}
