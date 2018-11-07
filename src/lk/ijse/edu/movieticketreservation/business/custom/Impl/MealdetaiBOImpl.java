/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.MealdetaiBO;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.MealDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.MealdetaiDAOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.MealDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.MealdetaiDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Meal;
import lk.ijse.edu.movieticketreservation.entity.Mealdetai;
import lk.ijse.edu.movieticketreservation.mdel.MealdetaiDTO;

/**
 *
 * @author sachin dilshan
 */
public class MealdetaiBOImpl implements MealdetaiBO {
    MealdetaiDAO mealdetaiDAO = new MealdetaiDAOImpl();
    MealDAO mealDao=new MealDAOImpl();

    @Override
    public boolean saveMealdetai(MealdetaiDTO melDetai) throws Exception {
        Connection connection = DBConnection.getInstacne().getConnection();
        connection.setAutoCommit(false);
        boolean isAdded = mealdetaiDAO.saveMealdetai(new Mealdetai(melDetai.getMealID(), melDetai.getCustID(), melDetai.getQty()));
        if(!isAdded){
            return false;
        }
        
        Meal meal=mealDao.search(melDetai.getMealID());
        int currentQuantity=meal.getQty();
        currentQuantity=currentQuantity-melDetai.getQty();
        meal.setQty(currentQuantity);
        isAdded=mealDao.update(meal);
        
        if(!isAdded){
            connection.rollback();
            return false;
        }
        connection.commit();
        return true;
    }

    @Override
    public boolean updateMealdetai(MealdetaiDTO melDetai) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteMealdetai(String mealId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MealdetaiDTO SerchMealdetai(String mealId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MealdetaiDTO> getAllMealdetai() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // public  static MealDAO mealDAO=(MealDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MEAL_DATAIL);
}
