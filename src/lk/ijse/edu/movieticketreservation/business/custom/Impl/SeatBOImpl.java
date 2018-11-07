/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.dao.custom.SeatDAO;
import lk.ijse.edu.movieticketreservation.mdel.SeatDTO;

/**
 *
 * @author sachin dilshan
 */
public class SeatBOImpl {
    private static SeatDAO seatDAO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SEAT);

    public static boolean addSeat(SeatDTO seat)throws Exception{
        return seatDAO.addSeat(seat);
    }
}
