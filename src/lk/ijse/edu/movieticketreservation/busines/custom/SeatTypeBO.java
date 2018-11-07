/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.busines.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.business.SupertBO;
import lk.ijse.edu.movieticketreservation.entity.SeataType;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;

/**
 *
 * @author sachin dilshan
 */
public interface SeatTypeBO extends SupertBO {

    public ArrayList<String> getAllSeatType() throws Exception;

    public SeataTypeDTO SerchSeatType(String seatId) throws Exception;

    public SeataTypeDTO serchSetSeatType(String seatId);

    public ArrayList<SeataTypeDTO> viewSeatTypeDetatis() throws Exception;

    public boolean updateSeatType(SeataTypeDTO seataType) throws Exception;

    public String getSeatPrice(String typeId) throws Exception;

    public String getSeatPriceBB(String typeId)throws Exception;

    public String getSeatPriceB(String typeId)throws Exception;

    public String getSeatPriceODC(String id)throws Exception;
}
