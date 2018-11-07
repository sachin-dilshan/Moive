/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import lk.ijse.edu.movieticketreservation.busines.custom.ResavationBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.ReservationBOImpl;
import lk.ijse.edu.movieticketreservation.mdel.ReservationDTO;

/**
 *
 * @author KAVINDA PUSHPITHA
 */
public class ResavationController {
    private static ResavationBO resavationBO=new ReservationBOImpl();
     public static boolean addResavation(ReservationDTO reservationDTO) throws Exception{
        return resavationBO.addResavation(reservationDTO);
    } 
    
}
