/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.SeatDAO;
import lk.ijse.edu.movieticketreservation.entity.Seat;
import lk.ijse.edu.movieticketreservation.mdel.SeatDTO;

/**
 *
 * @author sachin dilshan
 */
public class SeatDAOImpl implements SeatDAO{

    @Override
    public boolean save(Seat entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Seat shedule) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seat search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Seat> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addSeat(SeatDTO seat) throws Exception {
       // return CrudUtil.executeUpdate("Insert into seat Values(?,?)",seat.getSed(),seat.getIsBooking())>0;
       return  true;
    }

}
