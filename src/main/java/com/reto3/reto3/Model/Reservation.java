package com.reto3.reto3.Model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name="reservation")
public class Reservation implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate; 
    private Date devolutionDate;
    private String status;
    // relaciones
    @ManyToOne
    @JoinColumn (name = "id")
    @JsonIgnoreProperties ("reservations")
    private Computer computer;

    @ManyToOne
    @JoinColumn (name = "idClient")
    @JsonIgnoreProperties ({"reservations","messages"})
    private Client client;

    private String score;
    // fin de relaciones
    // getter and setter
    public Integer getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getDevolutionDate() {
        return devolutionDate;
    }
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    // getter and setter relaciones
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }


    // fin getter and setter

}
