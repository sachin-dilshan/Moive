/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.business.BOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.MealBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.MealBOImpl;
import lk.ijse.edu.movieticketreservation.mdel.MealDTO;

/**
 *
 * @author sachin dilshan
 */
public class ManageMealController {
    
    private static MealBO mealBO=new MealBOImpl();
    public static boolean addMeals(MealDTO meal) throws Exception {
        return mealBO.addMeals(meal);
    }

    public static ArrayList<MealDTO> getAllMeal() throws Exception {
        return mealBO.getAllMeal();
    }

    public static boolean deleteMeal(String mealId) throws Exception {
        return mealBO.deleteMeal(mealId);
    }

    public static boolean UpdateMeal(MealDTO meals) throws Exception {
        return mealBO.updateMeal(meals);
    }

    public static MealDTO serchMail(String mealID) throws Exception {
        return mealBO.serchMail(mealID);
    }

    public static ArrayList<String> getAllMeaID() throws Exception {
        return mealBO.getAllMeaID();
    }

}
