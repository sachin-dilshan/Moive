/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.busines.custom;

import lk.ijse.edu.movieticketeservation.business.SupertBO;
import lk.ijse.edu.movieticketreservation.mdel.ReservationDTO;

/**
 *
 * @author KAVINDA PUSHPITHA
 */
public interface ResavationBO extends SupertBO {

    public boolean addResavation(ReservationDTO reservationDTO) throws Exception;

}
