/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import lk.ijse.edu.movieticketreservation.busines.custom.SeatBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.SeatBOImpl;
import lk.ijse.edu.movieticketreservation.mdel.SeatDTO;

/**
 *
 * @author sachin dilshan
 */
public class ManageSeatController {

    public static boolean addSeat(SeatDTO seat) throws Exception {
        return SeatBOImpl.addSeat(seat);
    }


}
