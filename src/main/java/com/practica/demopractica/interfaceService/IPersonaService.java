package com.practica.demopractica.interfaceService;
import com.practica.demopractica.model.Persona;
import java.util.*;


public interface IPersonaService {
    public List<Persona> listar();
    public Optional<Persona> listarId(int id);
    public int save(Persona p);
    public void delete(int id);
}
