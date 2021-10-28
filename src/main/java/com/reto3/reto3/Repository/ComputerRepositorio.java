package com.reto3.reto3.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto3.reto3.Model.Computer;
import com.reto3.reto3.Repository.Crud.ComputerCrudRepositorio;

@Repository
public class ComputerRepositorio {
    @Autowired
    private ComputerCrudRepositorio computerCrudRepositorio;
    
    // metodo para mostrar
    public List<Computer> getAll(){
        return (List<Computer>)computerCrudRepositorio.findAll();
    }
    
    // metodo para buscar
    public Optional <Computer> getComputer(int id) {
        return computerCrudRepositorio.findById(id);
    }
    
    // metodo para guardar
    public Computer save(Computer computer){
        return computerCrudRepositorio.save(computer);
    }
    
    // metodo para borrar
    public void delete (Computer computer){
        computerCrudRepositorio.delete(computer);
    } 



}

