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

import com.reto3.reto3.Model.Client;
import com.reto3.reto3.Service.ClientServicio;

@RestController
@RequestMapping ("api/Client")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ClientControlador {
    @Autowired
    private ClientServicio clientServicio;
    
    @GetMapping("/all")
    public List<Client>getClient(){
        return clientServicio.getAll();
        }
    
    @GetMapping("/{id}")
    public Optional <Client> getClient(@PathVariable("Id") int id){
        return clientServicio.getClient(id);
        }
    
    @PostMapping ("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save (@RequestBody Client client){
        return clientServicio.save(client);
        }
     
    @PutMapping ("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Client update(@RequestBody Client client){
        return clientServicio.update(client);
        }
        
    @DeleteMapping ("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteClient(@PathVariable ("id") int id){
        return clientServicio.deleteClient(id);
        }    
}
