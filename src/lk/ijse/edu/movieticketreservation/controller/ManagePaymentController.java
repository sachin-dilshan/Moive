/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import java.util.ArrayList;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.PaymentBOImpl;
import lk.ijse.edu.movieticketreservation.mdel.PaymentDTO;



/**
 *
 * @author sachin dilshan
 */
public class ManagePaymentController {
    public static ArrayList<PaymentDTO> getSumofPayment()throws Exception{
        return PaymentBOImpl.sumOfPayment();
    }
    
}
