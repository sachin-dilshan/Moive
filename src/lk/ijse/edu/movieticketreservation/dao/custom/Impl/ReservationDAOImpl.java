/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.ResavationDAO;
import lk.ijse.edu.movieticketreservation.entity.Reservation;

/**
 *
 * @author sachin dilshan
 */
public class ReservationDAOImpl implements ResavationDAO{

    @Override
    public boolean save(Reservation entity) throws Exception {
       return CrudUtil.executeUpdate("Insert into reservation values(?,?,?,?,?,?,?)", entity.getrID(),entity.getPeyID(),entity.getCustID(),entity.getSeatCount(),entity.getMovieID(),entity.getRstDate(),entity.getRstTime())>0;
    }

    @Override
    public boolean update(Reservation shedule) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reservation search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Reservation> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
