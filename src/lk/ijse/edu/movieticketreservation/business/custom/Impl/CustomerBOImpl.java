/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;




import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.CustomerBO;
import lk.ijse.edu.movieticketreservation.dao.custom.CustomerDAO;
import lk.ijse.edu.movieticketreservation.entity.Customer;
import lk.ijse.edu.movieticketreservation.mdel.CustomerDTO;



/**
 *
 * @author sachin dilshan
 */
public class CustomerBOImpl implements CustomerBO{
    private static CustomerDAO customerDAO= DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    public  boolean addCustomer(CustomerDTO customer) throws Exception {
        return customerDAO.addCustomer(new Customer(customer.getCustId(),customer.getCustName(),customer.getContactNo(),customer.getDate(),customer.getTime()));
  
    }

    @Override
    public int getSumOfCustomer()throws Exception{
        return customerDAO.getSumOfCustomer();
    }
   
}
