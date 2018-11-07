/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import java.sql.Connection;
import lk.ijse.edu.movieticketreservation.busines.custom.ResavationBO;
import lk.ijse.edu.movieticketreservation.dao.custom.CustomerDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.CustomerDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.PaymetDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.ReservationDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.PaymentDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.ResavationDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Customer;
import lk.ijse.edu.movieticketreservation.entity.Payment;
import lk.ijse.edu.movieticketreservation.entity.Reservation;
import lk.ijse.edu.movieticketreservation.mdel.ReservationDTO;



/**
 *
 * @author sachin dilshan
 */
public class ReservationBOImpl implements ResavationBO{
  private CustomerDAO customerDAO=new CustomerDAOImpl();
    private PaymentDAO paymentDAO=new PaymetDAOImpl();
    private ResavationDAO resavationDAO=new ReservationDAOImpl();
    @Override
    public boolean addResavation(ReservationDTO reservationDTO) throws Exception {
         Connection connection=DBConnection.getInstacne().getConnection();
        connection.setAutoCommit(false);
        try{
            boolean result=customerDAO.save(new Customer(reservationDTO.getCustomerDTO().getCustId(), reservationDTO.getCustomerDTO().getCustName(), reservationDTO.getCustomerDTO().getContactNo(), reservationDTO.getCustomerDTO().getDate(), reservationDTO.getCustomerDTO().getTime()));
            if(!result){
                return false;
            }
            result=paymentDAO.save(new Payment(reservationDTO.getPaymentDTO().getPetID(),reservationDTO.getPaymentDTO().getAmount()));
            if(!result){
                connection.rollback();
                return false;
            }
            result=resavationDAO.save(new Reservation(reservationDTO.getrID(), reservationDTO.getPaymentDTO().getPetID(), reservationDTO.getCustomerDTO().getCustId(), reservationDTO.getSeatCount(), reservationDTO.getMovieID(), reservationDTO.getRstDate(), reservationDTO.getRstTime()));
            if(!result){
                connection.rollback();
                return false;
            }
            connection.commit();
            return true;
        }finally{
            connection.setAutoCommit(true);
        }
    }
}

    

