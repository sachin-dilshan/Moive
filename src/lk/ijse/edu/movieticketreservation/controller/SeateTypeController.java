/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import java.util.ArrayList;
import lk.ijse.edu.movieticketreservation.busines.custom.SeatTypeBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.SeatTypeBOimpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.SheduleBOImpl;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;

/**
 *
 * @author sachin dilshan
 */
public class SeateTypeController {
 private static SeatTypeBO seatTypeBO=new SeatTypeBOimpl();
    public static SeataTypeDTO serchSetSeatType(String seatId) throws Exception {
        return SheduleBOImpl.SearshSeatType(seatId);
    }

    public static ArrayList<String> getAllSeatType() throws Exception {
        return seatTypeBO.getAllSeatType();
    }

    public static ArrayList<SeataTypeDTO> viewSeatTypeDetatis() throws Exception {
        return seatTypeBO.viewSeatTypeDetatis();
    }

    public static boolean updateSeatType(SeataTypeDTO seataType)throws Exception{
        return seatTypeBO.updateSeatType(seataType);
    }
    public static String getSeatPrice(String id)throws Exception{
         return seatTypeBO.getSeatPrice(id);
    }

    public static String getSeatPriceBB(String id)throws Exception{
        return seatTypeBO.getSeatPriceBB(id);
    }

    public static String getSeatPriceB(String id) throws Exception {
        return seatTypeBO.getSeatPriceB(id);
    }

    public static String getSeatPriceODC(String id)throws Exception{
        return seatTypeBO.getSeatPriceODC(id);
    }

}
