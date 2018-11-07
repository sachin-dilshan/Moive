/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.SheduleDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Shedule;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;
import lk.ijse.edu.movieticketreservation.mdel.SheduleDTO;

/**
 *
 *
 * @author sachin dilshan
 */
public class SheduleDAOImpl implements SheduleDAO {

    @Override
    public SheduleDTO getSerchSheduleDetails(String shedule) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select *from shedule where SheduleID='" + shedule + "'");
        if (rst.next()) {
            return new SheduleDTO(rst.getString("SheduleID"), rst.getString("MovieID"), rst.getString("Time"));

        }
        return null;
    }

    @Override
    public SeataTypeDTO searshSeatType(String seatId) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select *from seattype where TypeID='" + seatId + "'");
        if (rst.next()) {
            return new SeataTypeDTO(rst.getString("TypeID"), rst.getDouble("SeatPrice"), rst.getString("SatName"));
        }
        return null;
    }

    @Override
    public ArrayList<String> getAllSheduleId() throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        String SQL = "Select SheduleID from shedule";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<String> sheduleId = new ArrayList<>();
        while (rst.next()) {
            sheduleId.add(rst.getString("SheduleID"));
        }
        return sheduleId;
    }

    @Override
    public ArrayList<SheduleDTO> viewSheduleDetails() throws Exception {
        ArrayList<SheduleDTO> allSheduleDetails = new ArrayList<>();
        String SQL = "select *from shedule";
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            allSheduleDetails.add(new SheduleDTO(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return allSheduleDetails;
    }

    @Override
    public SheduleDTO searchByTime(String time) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        String SQL = "Select * From shedule where Time='" + time + "'";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);

        if (rst.next()) {

            return new SheduleDTO(rst.getString("SheduleID"), rst.getString("MovieID"), rst.getString("Time"));
        } else {
            return null;
        }
    }

    @Override
    public boolean save(Shedule entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shedule search(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Shedule> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SheduleDTO getSheduleTime(String sheduleId) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("select *from shedule where SheduleID='" + sheduleId + "'");
        if (rst.next()) {
            return new SheduleDTO(rst.getString("Time"), rst.getString("SheduleID"), rst.getString("MovieID"));
        }
        return null;
    }

    @Override
    public boolean update(Shedule shedule) throws Exception {
        return CrudUtil.executeUpdate("Update Shedule set MovieID=?,Time=? where SheduleID=? ", shedule.getMovieID(), shedule.getTime(), shedule.getSheduleID()) > 0;
    }

    @Override
    public boolean addShedule(Shedule shedule) throws Exception {
        return  CrudUtil.executeUpdate("Insert Into shedule Values(?,?,?)",shedule.getSheduleID(),shedule.getMovieID(),shedule.getTime())>0;
    }

    @Override
    public ArrayList<SheduleDTO> getAllShedule()throws Exception{
        ArrayList<SheduleDTO> allSheduleDetails = new ArrayList<>();
        String SQL = "select *from shedule";
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            allSheduleDetails.add(new SheduleDTO(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return allSheduleDetails;
    }

    @Override
    public boolean delectShedule(String toString)throws Exception{
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        int rowa = stm.executeUpdate("Delete from Meal where MealID='" + toString + "'");
        return rowa > 0;
    }
}
