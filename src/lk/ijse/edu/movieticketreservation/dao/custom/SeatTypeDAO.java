/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudDOA;
import lk.ijse.edu.movieticketeservation.dao.SuperDAO;
import lk.ijse.edu.movieticketreservation.entity.SeataType;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;

/**
 *
 * @author sachin dilshan
 */
public interface SeatTypeDAO extends CrudDOA<SeataType, String>{

//public  boolean updateSeatType(SeataTypeDTO seataType)throws Exception;
    public boolean deleteSeatType(String TypeID) throws Exception;

    public SeataTypeDTO SerchSeatType(String TypeID) throws Exception;

    public ArrayList<String> getAllSeatType() throws Exception;

    public boolean addSeatType(SeataTypeDTO seataType) throws Exception;

    public ArrayList<SeataTypeDTO> viewSeatTypeDetatis() throws Exception;

    public boolean update(SeataType seataType) throws Exception;
    
    public String getSeatPrice(String seatTypeID) throws Exception;

    public String getSeatPriceBB(String seatTypeID)throws Exception;

    public String getSeatPriceB(String seatTypeID)throws Exception;

    public String getSeatPriceODC(String typeId)throws Exception;

}
