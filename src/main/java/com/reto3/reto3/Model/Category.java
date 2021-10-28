package com.reto3.reto3.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table (name="category")
public class Category implements Serializable { 

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name; 
    private String description;

    // relaciones
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category")    
    @JsonIgnoreProperties ("category")
    private List<Computer> computers;
    // fin de relaciones
    // getter and setter
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    } 

    // getter and setter relaciones
    public List<Computer> getComputers() {
        return computers;
    }
    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
    
    // fin getter and setter

}
