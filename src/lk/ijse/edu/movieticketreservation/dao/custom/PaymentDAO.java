/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudDOA;
import lk.ijse.edu.movieticketreservation.entity.Payment;
import lk.ijse.edu.movieticketreservation.mdel.PaymentDTO;

/**
 *
 * @author KAVINDA PUSHPITHA
 */
public interface PaymentDAO extends CrudDOA<Payment, String>{
    public ArrayList<PaymentDTO> sumOfPAyment()throws Exception;
    
}
