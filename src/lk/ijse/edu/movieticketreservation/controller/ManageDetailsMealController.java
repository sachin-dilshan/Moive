/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import lk.ijse.edu.movieticketreservation.busines.custom.MealdetaiBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.MealdetaiBOImpl;
import lk.ijse.edu.movieticketreservation.entity.Mealdetai;
import lk.ijse.edu.movieticketreservation.mdel.MealdetaiDTO;

/**
 *
 * @author sachin dilshan
 */
public class ManageDetailsMealController {
    private static MealdetaiBO mealdetaiBO=new MealdetaiBOImpl();
    public static boolean addDetails(MealdetaiDTO mealdetai) throws Exception {
        return mealdetaiBO.saveMealdetai(mealdetai);
    }
    
}
