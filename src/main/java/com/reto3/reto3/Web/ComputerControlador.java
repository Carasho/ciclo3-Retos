package com.reto3.reto3.Web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reto3.reto3.Model.Computer;
import com.reto3.reto3.Service.ComputerServicio;

@RestController
@RequestMapping("api/Computer")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ComputerControlador {
    @Autowired
    private ComputerServicio computerServicio;
    
    @GetMapping("/all")
    public List<Computer>getComputer(){
        return computerServicio.getAll();
        }
    
    @GetMapping("/{id}")
    public Optional <Computer> getComputer(@PathVariable("Id") int id){
        return computerServicio.getComputer(id);
        }
    
    @PostMapping ("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save (@RequestBody Computer computer){
        return computerServicio.save(computer);
        }
     
    @PutMapping ("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer update(@RequestBody Computer computer){
        return computerServicio.update(computer);
        }
        
    @DeleteMapping ("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteComputer(@PathVariable ("id") int id){
        return computerServicio.deleteComputer(id);
        }     
}
