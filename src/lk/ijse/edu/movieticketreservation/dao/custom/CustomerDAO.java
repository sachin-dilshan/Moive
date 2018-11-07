/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudDOA;
import lk.ijse.edu.movieticketeservation.dao.SuperDAO;
import lk.ijse.edu.movieticketreservation.entity.Customer;
import lk.ijse.edu.movieticketreservation.mdel.CustomerDTO;

/**
 *
 * @author sachin dilshan
 */
public interface CustomerDAO extends CrudDOA<Customer, String>{
    
    public  boolean addCustomer(Customer customer) throws Exception;
    
    public  boolean updateCustomer(CustomerDTO customer)throws Exception;
    
    public  boolean deleteCustomer(String customerId) throws Exception;
    
    public  CustomerDTO searchCustomer(String customerId)throws Exception;
    
    public  ArrayList<CustomerDTO> getAllCustomers()throws Exception;

    public int getSumOfCustomer() throws Exception;
}
