package com.reto3.reto3.Repository.Crud;

import org.springframework.data.repository.CrudRepository;
import com.reto3.reto3.Model.Message;

public interface MessageCrudRepositorio extends CrudRepository <Message, Integer> {
    
}
