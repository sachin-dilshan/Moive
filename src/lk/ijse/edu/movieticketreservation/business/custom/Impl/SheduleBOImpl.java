/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.SheduleBO;
import lk.ijse.edu.movieticketreservation.dao.custom.SheduleDAO;
import lk.ijse.edu.movieticketreservation.entity.Shedule;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;
//import lk.ijse.edu.movieticketreservation.dao.custom.Impl.SheduleDAOImpl;
import lk.ijse.edu.movieticketreservation.mdel.SheduleDTO;

/**
 *
 * @author sachin dilshan
 */
public class SheduleBOImpl implements SheduleBO{

    private static SheduleDAO sheduleDTO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SHEDULE);

    public static ArrayList<Shedule> getAllSheduleIds() throws Exception {
        return sheduleDTO.getAll();

    }

    public static SheduleDTO searchByTime(String time) throws Exception {
        return sheduleDTO.searchByTime(time);
    }

    public static SeataTypeDTO SearshSeatType(String seatId) throws Exception {
        return sheduleDTO.searshSeatType(seatId);
    }

    public static ArrayList<String> getAllSheduleId() throws Exception {
        return sheduleDTO.getAllSheduleId();
    }

    public static ArrayList<SheduleDTO> viewSheduleDetails() throws Exception {
        return sheduleDTO.viewSheduleDetails();
    }

    public static SheduleDTO getSheduleTime(String sheduleId) throws Exception {
        return sheduleDTO.getSheduleTime(sheduleId);
    }

    public static boolean update(SheduleDTO shedule) throws Exception {
        return sheduleDTO.update(new Shedule(shedule.getSheduleID(), shedule.getMovieID(), shedule.getTime()));
    }

    public static boolean addShedule(SheduleDTO shedule) throws Exception{
      return sheduleDTO.addShedule(new Shedule(shedule.getSheduleID(),shedule.getMovieID(),shedule.getTime()));
    }

    public static ArrayList<SheduleDTO> getAllShedule()throws Exception{
        return sheduleDTO.getAllShedule();
    }

    public static boolean deleteShedule(String toString)throws Exception{
        return sheduleDTO.delectShedule(toString);
    }
}
