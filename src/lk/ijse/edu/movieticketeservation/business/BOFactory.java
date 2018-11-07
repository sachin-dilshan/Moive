/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketeservation.business;

import lk.ijse.edu.movieticketreservation.business.custom.Impl.CategoryBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.CustomerBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.MealBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.MealdetaiBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.MovieBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.PaymentBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.ReservationBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.SeatBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.SeatTypeBOimpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.SheduleBOImpl;

/**
 *
 * @author sachin dilshan
 */
public class BOFactory {

    public enum BOTypes {
        CATEGORY, CUSTOMER, MEAL, MEAL_DATAIL, MOVIE, SEAT_ETYPE, SHEDULE, PAYMENT, RESERVATION, SEAT;
    }

    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public <T extends SupertBO> T getBO(BOTypes boType) {
        switch (boType) {
            case CATEGORY:
                return (T) new CategoryBOImpl();
            case CUSTOMER:
                return (T) new CustomerBOImpl();
            case MEAL:
                return (T) new MealBOImpl();
            case MEAL_DATAIL:
                return (T) new MealdetaiBOImpl();
            case MOVIE:
                return (T) new MovieBOImpl();
            case SEAT_ETYPE:
                return (T) new SeatTypeBOimpl();
            case SHEDULE:
                return (T) new SheduleBOImpl();
            case PAYMENT:
                return (T) new PaymentBOImpl();
            case RESERVATION:
                return (T) new ReservationBOImpl();
            case SEAT:
                return (T) new SeatBOImpl();
            default:
                return null;
        }
    }

}
