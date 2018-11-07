/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudDOA;
import lk.ijse.edu.movieticketeservation.dao.SuperDAO;
import lk.ijse.edu.movieticketreservation.entity.Shedule;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;
import lk.ijse.edu.movieticketreservation.mdel.SheduleDTO;

/**
 *
 * @author sachin dilshan
 */
public interface SheduleDAO extends CrudDOA<Shedule, String> {

    public SheduleDTO searchByTime(String time) throws Exception;

    public SheduleDTO getSerchSheduleDetails(String shedule) throws Exception;

    public SeataTypeDTO searshSeatType(String seatId) throws Exception;

    public ArrayList<String> getAllSheduleId() throws Exception;

    public ArrayList<SheduleDTO> viewSheduleDetails() throws Exception;

    public SheduleDTO getSheduleTime(String sheduleId) throws Exception;

    public boolean addShedule(Shedule shedule)throws Exception;

    public ArrayList<SheduleDTO> getAllShedule()throws Exception;

    public boolean delectShedule(String toString)throws Exception;

}
