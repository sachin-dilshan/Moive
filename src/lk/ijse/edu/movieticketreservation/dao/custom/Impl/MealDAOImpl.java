
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.MealDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Meal;
import lk.ijse.edu.movieticketreservation.mdel.MealDTO;

/**
 *
 * @author sachin dilshan
 */
public class MealDAOImpl implements MealDAO {

    @Override
    public boolean updateMeal(MealDTO meal) throws Exception {
        return CrudUtil.executeUpdate("Update Meal set MealName=?,UnitPrice=?,Qty=? where MealID=? ", meal.getMealName(), meal.getUnitPrice(), meal.getQty(), meal.getMealID()) > 0;
    }

    @Override
    public boolean deleteMeal(String mealId) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        int rowa = stm.executeUpdate("Delete from Meal where MealID='" + mealId + "'");
        return rowa > 0;
    }

    @Override
    public MealDTO SerchMeal(String mealID) throws Exception {
        Connection connection = DBConnection.getInstacne().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select *from Meal where MealID='" + mealID + "'");
        if (rst.next()) {

            return new MealDTO(rst.getString("mealID"), rst.getString("mealName"), rst.getDouble("unitPrice"), rst.getInt("Qty"));
        }
        return null;
    }

    @Override
    public ArrayList<MealDTO> getAllMeal() throws Exception {
        ArrayList<MealDTO> allItem = new ArrayList<>();
        String SQL = "Select *from Meal";
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            allItem.add(new MealDTO(rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3),
                    rst.getInt(4)
            ));

        }
        return allItem;
    }

    @Override
    public boolean addMeals(Meal meal) throws Exception {
        return CrudUtil.executeUpdate("Insert Into Meal values(?,?,?,?)",
                meal.getMealID(),
                meal.getMealName(),
                meal.getUnitPrice(),
                meal.getQty()) > 0;
    }

    @Override
    public boolean save(Meal entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Meal meal) throws Exception {
        return CrudUtil.executeUpdate("update Meal set MealName=?,UnitPrice=?,Qty=? where MealID=? ",
                meal.getMealName(),
                meal.getUnitPrice(),
                meal.getQty(),
                meal.getMealID()) > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Meal search(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select *from Meal where MealID='" + id + "'");
        if (rst.next()) {
            return new Meal(rst.getString("mealID"), rst.getString("mealName"), rst.getDouble("unitPrice"), rst.getInt("Qty"));
        }
        return null;
    }

    @Override
    public ArrayList<Meal> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
