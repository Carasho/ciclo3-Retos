package com.reto3.reto3.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto3.reto3.Model.Message;
import com.reto3.reto3.Repository.Crud.MessageCrudRepositorio;

@Repository
public class MessageRepositorio {
    @Autowired
    private MessageCrudRepositorio messageCrudRepositorio;
    
    // metodo para mostrar
    public List<Message> getAll(){
        return (List<Message>)messageCrudRepositorio.findAll();
    }
    
    // metodo para buscar
    public Optional <Message> getMessage(int id) {
        return messageCrudRepositorio.findById(id);
    }
    
    // metodo para guardar
    public Message save(Message message){
        return messageCrudRepositorio.save(message);
    }
    
    // metodo para borrar
    public void delete (Message message){
        messageCrudRepositorio.delete(message);
    } 



}
