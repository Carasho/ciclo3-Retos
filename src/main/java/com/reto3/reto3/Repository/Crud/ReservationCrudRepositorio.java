package com.reto3.reto3.Repository.Crud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

import com.reto3.reto3.Model.Reservation;

public interface ReservationCrudRepositorio extends CrudRepository <Reservation, Integer> {
    public List<Reservation> findAllByStatus (String status); 
    
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);
    
    /*SELECT clientid, COUNT(*) AS total FROM reservacion group by clientid order by desc;*/
    @Query ("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client)DESC")
    public List<Object[]> countTotalReservationsByClient();
}
