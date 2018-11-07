/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;


import java.util.ArrayList;
import lk.ijse.edu.movieticketreservation.busines.custom.CustomerBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.CustomerBOImpl;
import lk.ijse.edu.movieticketreservation.mdel.CustomerDTO;

/**
 *
 * @author sachin dilshan
 */
public class ManageCustomerController {
    private static CustomerBO customerBO=new CustomerBOImpl();

    public static int getSumOfCustomer()throws Exception{
        return customerBO.getSumOfCustomer();
    }
    public  boolean addCustomer(CustomerDTO customer) throws Exception{
        return customerBO.addCustomer(customer);
    } 
}
