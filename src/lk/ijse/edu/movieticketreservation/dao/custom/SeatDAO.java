/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import lk.ijse.edu.movieticketeservation.dao.CrudDOA;
import lk.ijse.edu.movieticketreservation.entity.Seat;
import lk.ijse.edu.movieticketreservation.mdel.SeatDTO;

/**
 *
 * @author sachin dilshan
 */
public interface SeatDAO extends CrudDOA<Seat, String>{
    public boolean addSeat(SeatDTO seat)throws Exception;

}
