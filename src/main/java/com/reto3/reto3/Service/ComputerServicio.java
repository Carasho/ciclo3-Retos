package com.reto3.reto3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto3.reto3.Model.Computer;
import com.reto3.reto3.Repository.ComputerRepositorio;

@Service
public class ComputerServicio {
    @Autowired
    private ComputerRepositorio computerRepositorio ;

    public List<Computer>getAll(){
        return computerRepositorio.getAll();
    }
    
    public Optional <Computer>getComputer(int id){
        return computerRepositorio.getComputer(id);
    }

    public Computer save(Computer computer){
    // verificamos si el departamento es nuevo y de ser asi guarda
        if (computer.getId()== null){
            return computerRepositorio.save(computer);
        } else{ // si el objeto viene con numId se verifica si existe o no
            Optional <Computer> consulta = computerRepositorio.getComputer(computer.getId());
            if (consulta.isEmpty()) {
                return computerRepositorio.save(computer);
            } else {
                return computer;
            } 
        }
     
    } 

    public Computer update(Computer computer){
        if (computer.getId() != null){// si el objeto viene con numId se verifica si existe o no
            Optional <Computer> consulta = computerRepositorio.getComputer(computer.getId());
            if (!consulta.isEmpty()) {// si el objeto es diferente a null
                if (computer.getName() != null) {
                    consulta.get().setName(computer.getName());
                }
                if (computer.getDescription() !=null) {
                    consulta.get().setName(computer.getDescription());
                }
                if (computer.getBrand() !=null) {
                    consulta.get().setBrand(computer.getBrand());
                } 
                if (computer.getYear() !=null) {
                    consulta.get().setYear(computer.getYear());
                }
                return computerRepositorio.save(consulta.get());
            } 
        }
        return computer;
    }

    public boolean deleteComputer(int id){
        Optional <Computer> consulta = computerRepositorio.getComputer(id);
            if (!consulta.isEmpty()){
                computerRepositorio.delete(consulta.get());
                return true;
            }
            return false;
    }

}
