package com.reto3.reto3.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto3.reto3.Model.Client;
import com.reto3.reto3.Repository.Crud.ClientCrudRepositorio;

@Repository
public class ClientRepositorio {
    @Autowired
    private ClientCrudRepositorio clientCrudRepositorio;
    
    // metodo para mostrar
    public List<Client> getAll(){
        return (List<Client>)clientCrudRepositorio.findAll();
    }
    
    // metodo para buscar
    public Optional <Client> getClient(int id) {
        return clientCrudRepositorio.findById(id);
    }
    
    // metodo para guardar
    public Client save(Client client){
        return clientCrudRepositorio.save(client);
    }
    
    // metodo para borrar
    public void delete (Client client){
        clientCrudRepositorio.delete(client);
    } 



}
