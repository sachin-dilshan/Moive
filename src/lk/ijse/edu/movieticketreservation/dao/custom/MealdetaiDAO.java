/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.SuperDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.MealdetaiDAOImpl;
import lk.ijse.edu.movieticketreservation.entity.Mealdetai;
import lk.ijse.edu.movieticketreservation.mdel.MealdetaiDTO;

/**
 *
 * @author sachin dilshan
 */
public interface MealdetaiDAO {
    
    public  boolean saveMealdetai(Mealdetai melDetai)throws Exception;
    
    public  boolean updateMealdetai(Mealdetai melDetai)throws Exception; 
    
    public  boolean deleteMealdetai(String mealId)throws Exception;
    
    public  Mealdetai SerchMealdetai(String mealId)throws Exception;
    
    public  ArrayList<Mealdetai> getAllMealdetai()throws Exception;
    
    //public  boolean addMeals(MealdetaiDTO meal)throws Exception;
}
