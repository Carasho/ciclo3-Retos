package com.reto3.reto3.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto3.reto3.Model.Category;
import com.reto3.reto3.Repository.Crud.CategoryCrudRepositorio;

@Repository
public class CategoryRepositorio {
    @Autowired
    private CategoryCrudRepositorio categoryCrudRepositorio;
    
    // metodo para mostrar
    public List<Category> getAll(){
        return (List<Category>)categoryCrudRepositorio.findAll();
    }
    
    // metodo para buscar
    public Optional <Category> getCategory(int id) {
        return categoryCrudRepositorio.findById(id);
    }
    
    // metodo para guardar
    public Category save(Category category){
        return categoryCrudRepositorio.save(category);
    }
    
    // metodo para borrar
    public void delete (Category category){
        categoryCrudRepositorio.delete(category);
    } 


}
