/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.SeatTypeBO;
import lk.ijse.edu.movieticketreservation.dao.custom.SeatTypeDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.SeatTypeDAOImpl;
import lk.ijse.edu.movieticketreservation.entity.SeataType;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;

/**
 *
 * @author sachin dilshan
 */
public class SeatTypeBOimpl implements SeatTypeBO{

    //private static SeatTypeDAO seatTypeDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SEAT_ETYPE);
    private static SeatTypeDAO seatTypeDAO=new SeatTypeDAOImpl();
    public  ArrayList<String> getAllSeatType() throws Exception {
        return seatTypeDAO.getAllSeatType();
    }

    public  SeataTypeDTO SerchSeatType(String seatId) throws Exception {
        return seatTypeDAO.SerchSeatType(seatId);

    }

    public  SeataTypeDTO serchSetSeatType(String seatId) {
        return null;
    }

    public  ArrayList<SeataTypeDTO> viewSeatTypeDetatis() throws Exception {
        return seatTypeDAO.viewSeatTypeDetatis();
    }
    
    public  boolean updateSeatType(SeataTypeDTO seataType) throws Exception {
        return seatTypeDAO.update(new SeataType(seataType.getTypeID(),seataType.getSeatPrice(),seataType.getSatName()));
    }

    @Override
    public String getSeatPrice(String typeId) throws Exception {
        return seatTypeDAO.getSeatPrice(typeId);
    }

    @Override
    public String getSeatPriceBB(String typeId) throws Exception {
        return seatTypeDAO.getSeatPriceBB(typeId);
    }

    @Override
    public String getSeatPriceB(String typeId) throws Exception {
        return seatTypeDAO.getSeatPriceB(typeId);
    }

    @Override
    public String getSeatPriceODC(String typeId) throws Exception {
        return seatTypeDAO.getSeatPriceODC(typeId);
    }
}
