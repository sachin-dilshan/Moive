/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudDOA;
import lk.ijse.edu.movieticketeservation.dao.SuperDAO;
import lk.ijse.edu.movieticketreservation.entity.Meal;
import lk.ijse.edu.movieticketreservation.mdel.MealDTO;

/**
 *
 * @author sachin dilshan
 */
public interface MealDAO extends CrudDOA<Meal, String>{
    
    public  boolean updateMeal(MealDTO meal)throws Exception;
    
    public  boolean deleteMeal(String mealId)throws Exception;
    
    public  MealDTO SerchMeal(String mealID) throws Exception;
    
    public  ArrayList<MealDTO> getAllMeal()throws Exception;
     
    public boolean addMeals(Meal meal)throws Exception;
    
}
