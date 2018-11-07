/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.CustomerDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Customer;
import lk.ijse.edu.movieticketreservation.mdel.CustomerDTO;

/**
 *
 * @author sachin dilshan
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public boolean addCustomer(Customer customer) throws Exception {
           String SQL="Insert into customer Values(?,?,?,?,?)";
           Connection conn= DBConnection.getInstacne().getConnection();
           PreparedStatement stm=conn.prepareStatement(SQL);
           stm.setObject(1,customer.getCustId());
           stm.setObject(2,customer.getCustName());
           stm.setObject(3,customer.getContactNo());
           stm.setObject(4,customer.getDate());
           stm.setObject(5,customer.getTime());
           return  stm.executeUpdate()>0;    
        }

    @Override
    public boolean updateCustomer(CustomerDTO customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCustomer(String customerId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerDTO searchCustomer(String customerId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(Customer entity) throws Exception {
        return CrudUtil.executeUpdate("Insert into customer values(?,?,?,?,?) ", entity.getCustId(),entity.getCustName(),entity.getContactNo(),entity.getDate(),entity.getTime())>0;
    }

    @Override
    public boolean update(Customer entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Customer> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSumOfCustomer()throws Exception{
        ArrayList<CustomerDTO>allCustomer=new ArrayList<>();
        String SQL="select count(custId)from customer";
        Connection conn=DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
       ResultSet rst=stm.executeQuery(SQL);
       
       int count=0;
       
       CustomerDTO ctdo=new CustomerDTO();
        while (rst.next()) {            
            count=rst.getInt(1);
        }
        return count;
    }
}
