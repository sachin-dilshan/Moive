/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.dao.custom.MealDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.PaymentDAO;
import lk.ijse.edu.movieticketreservation.mdel.MealDTO;
import lk.ijse.edu.movieticketreservation.mdel.PaymentDTO;



/**
 *
 * @author sachin dilshan
 */
public class PaymentBOImpl{
    private static PaymentDAO paymentDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    public static ArrayList<PaymentDTO> sumOfPayment()throws Exception{
        return paymentDAO.sumOfPAyment();
    }

    
}
