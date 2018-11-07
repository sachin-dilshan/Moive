/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.busines.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.business.SupertBO;
import lk.ijse.edu.movieticketreservation.mdel.MealDTO;

/**
 *
 * @author sachin dilshan
 */
public interface MealBO extends SupertBO {

    public ArrayList<String> getAllMeaID() throws Exception;

    public MealDTO serchMail(String mealID) throws Exception;

    public boolean addMeals(MealDTO meal) throws Exception;

    public ArrayList<MealDTO> getAllMeal() throws Exception;

    public boolean deleteMeal(String mealId) throws Exception;

    public boolean updateMeal(MealDTO meals) throws Exception;

}
