/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import java.util.ArrayList;
import lk.ijse.edu.movieticketreservation.busines.custom.SheduleBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.CategoryBOImpl;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.SheduleBOImpl;
import lk.ijse.edu.movieticketreservation.entity.Shedule;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;
import lk.ijse.edu.movieticketreservation.mdel.SheduleDTO;


/**
 *
 * @author sachin dilshan
 */
public class ManageShaduleController {


 
    SheduleBO sheduleBO=new SheduleBOImpl();
    public static SheduleDTO searchByTime(String time) throws Exception{
        return SheduleBOImpl.searchByTime(time);
    } 
    public static ArrayList<SheduleDTO> viewSheduleDetails() throws Exception {
        return SheduleBOImpl.viewSheduleDetails();
    }

    public static ArrayList<String> getAllSheduleId() throws Exception {
        return SheduleBOImpl.getAllSheduleId();
    }
    public static SheduleDTO getTime(String sheduleId) throws Exception{
        return SheduleBOImpl.getSheduleTime(sheduleId);   
    }

       public static boolean updateCategory(SheduleDTO shedule)throws Exception{
        return  SheduleBOImpl.update(shedule);
    }

    public static boolean addShedule(SheduleDTO shedule)throws Exception{
        return SheduleBOImpl.addShedule(shedule);
    }
       public static ArrayList<SheduleDTO> getAllShedule()throws Exception{
        return SheduleBOImpl.getAllShedule();
    }
       
    public static boolean deleteMeal(String toString)throws Exception{
        return  SheduleBOImpl.deleteShedule(toString);
    }
}
