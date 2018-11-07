/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.PaymentDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Payment;
import lk.ijse.edu.movieticketreservation.mdel.PaymentDTO;

/**
 *
 * @author sachin dilshan
 */
public class PaymetDAOImpl implements PaymentDAO {

    @Override
    public boolean save(Payment entity) throws Exception {
        return CrudUtil.executeUpdate("Insert into payment values(?,?) ", entity.getPetID(), entity.getAmount()) > 0;
    }

    @Override
    public boolean update(Payment shedule) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payment search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Payment> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentDTO> sumOfPAyment() throws Exception {
        ArrayList<PaymentDTO> allPayment = new ArrayList<>();
        String SQL = "select sum(amount)from payment";
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        PaymentDTO pdto = new PaymentDTO();
        while (rst.next()) {
            pdto.setAmount(rst.getDouble(1));
            allPayment.add(pdto);

        }
        return allPayment;
    }

}
