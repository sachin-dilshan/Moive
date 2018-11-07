/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.MealdetaiDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Mealdetai;
import lk.ijse.edu.movieticketreservation.mdel.MealdetaiDTO;

/**
 *
 * @author sachin dilshan
 */

public class MealdetaiDAOImpl implements MealdetaiDAO{
//return CrudUtil.executeUpdate("Insert into customer values(?,?,?,?,?) ", entity.getCustId(),entity.getCustName(),entity.getContactNo(),entity.getDate(),entity.getTime())>0;

    @Override
    public boolean saveMealdetai(Mealdetai melDetai) throws Exception {
        return CrudUtil.executeUpdate("Insert Into mealdetail Values(?,?,?)", melDetai.getMealID(),melDetai.getCustID(),melDetai.getQty())>0;
    }

    @Override
    
    public boolean updateMealdetai(Mealdetai melDetai) throws Exception {
    return CrudUtil.executeUpdate("Update mealdetail set CustID=?,Qty=? where MealID=?",melDetai.getCustID(),melDetai.getQty(),melDetai.getMealID())>0;
    }

    @Override
    public boolean deleteMealdetai(String mealId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mealdetai SerchMealdetai(String mealId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Mealdetai> getAllMealdetai() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
