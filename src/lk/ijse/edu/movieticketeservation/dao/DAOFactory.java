/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketeservation.dao;


import lk.ijse.edu.movieticketreservation.business.custom.Impl.PasswordBOImpl;
//import lk.ijse.edu.movieticketreservation.dao.custom.Impl.AdminDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.CategoryDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.CustomerDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.MealDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.MealdetaiDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.MovieDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.PasswordDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.PaymetDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.ReservationDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.SeatDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.SeatTypeDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.SheduleDAOImpl;

/**
 *
 * @author sachin dilshan
 */
public class DAOFactory {
    public  enum DAOTypes{
        CATEGORY,CUSTOMER,MEAL,MEAL_DATAIL,MOVIE,SEAT_ETYPE,SHEDULE,PAYMENT,RESERVATION,SEAT,ADMIN,PASSWORD;
    }
    private static DAOFactory dAOFactory;

    private DAOFactory(){
    
    }
    public  static  DAOFactory getInstance(){
        if (dAOFactory==null) {
            dAOFactory = new DAOFactory();
        }
        return  dAOFactory;
    }
    public <T>T getDAO(DAOTypes dAOTypes){
        switch(dAOTypes){
            case CATEGORY:
                return (T)new CategoryDAOImpl();
            case CUSTOMER:
                return (T)new CustomerDAOImpl();
            case MEAL:
                return (T)new MealDAOImpl();
            case MEAL_DATAIL:
                return (T)new MealdetaiDAOImpl();
            case MOVIE:
                return (T)new MovieDAOImpl();
            case SEAT_ETYPE:
                return (T)new SeatTypeDAOImpl();
            case SHEDULE:
                return (T)new SheduleDAOImpl();
            case PAYMENT:
                return (T)new PaymetDAOImpl();
            case RESERVATION:
                return (T)new ReservationDAOImpl();
            case SEAT:
                return (T)new SeatDAOImpl();
            case PASSWORD:
                return (T)new PasswordDAOImpl();
                case ADMIN:
               // return (T) new AdminDAOImpl();
                default:
                return null;
        }
    }

}
