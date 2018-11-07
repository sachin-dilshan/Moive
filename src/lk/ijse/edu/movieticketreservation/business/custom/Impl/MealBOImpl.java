 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.MealBO;
import lk.ijse.edu.movieticketreservation.dao.custom.MealDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.MealDAOImpl;
import lk.ijse.edu.movieticketreservation.entity.Meal;
import lk.ijse.edu.movieticketreservation.mdel.MealDTO;

/**
 *
 * @author sachin dilshan
 */
public class MealBOImpl implements MealBO {

    private static MealDAO mealDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEAL);

    public ArrayList<String> getAllMeaID() throws Exception {
        ArrayList<MealDTO> AllMeal = mealDAO.getAllMeal();
        ArrayList<String> mealName = new ArrayList<>();
        for (MealDTO meal : AllMeal) {
            mealName.add(meal.getMealID());
        }
        return mealName;
    }

    public MealDTO serchMail(String mealID) throws Exception {
        return mealDAO.SerchMeal(mealID);
    }

    public boolean addMeals(MealDTO meal) throws Exception {
        return mealDAO.addMeals(new Meal(meal.getMealID(), meal.getMealName(), meal.getUnitPrice(), meal.getQty()));
    }

    public ArrayList<MealDTO> getAllMeal() throws Exception {
        ArrayList<MealDTO> allItem = new ArrayList<>();
        return mealDAO.getAllMeal();
    }

    public boolean deleteMeal(String mealId) throws Exception {
        return mealDAO.deleteMeal(mealId);

    }

    public boolean updateMeal(MealDTO meals) throws Exception {
        return mealDAO.update(new Meal(meals.getMealID(), meals.getMealName(), meals.getUnitPrice(), meals.getQty()));
    }
}
