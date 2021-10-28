package com.reto3.reto3.Repository.Crud;

import org.springframework.data.repository.CrudRepository;
import com.reto3.reto3.Model.Reservation;

public interface ReservationCrudRepositorio extends CrudRepository <Reservation, Integer> {
    
}
