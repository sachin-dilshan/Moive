/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.busines.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.business.SupertBO;
import lk.ijse.edu.movieticketreservation.mdel.MealdetaiDTO;

/**
 *
 * @author sachin dilshan
 */
public interface MealdetaiBO extends SupertBO{
    public  boolean saveMealdetai(MealdetaiDTO melDetai)throws Exception;
    
    public  boolean updateMealdetai(MealdetaiDTO melDetai)throws Exception; 
    
    public  boolean deleteMealdetai(String mealId)throws Exception;
    
    public  MealdetaiDTO SerchMealdetai(String mealId)throws Exception;
    
    public ArrayList<MealdetaiDTO>getAllMealdetai()throws Exception;
    //public  ArrayList<MealdetaiDTO> getAllMealdetai()throws Exception; 
}
