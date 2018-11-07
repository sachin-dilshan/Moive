/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.CategoryDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Category;
import lk.ijse.edu.movieticketreservation.entity.Shedule;
import lk.ijse.edu.movieticketreservation.mdel.CategortDTO;

/**
 *
 * @author sachin dilshan
 */
public class CategoryDAOImpl implements CategoryDAO {

    @Override
    public ArrayList<String> getAllCategoryId() throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        String SQL = "Select CategoryID from category";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<String> allCategoryId = new ArrayList<>();
        while (rst.next()) {
            allCategoryId.add(rst.getString("CategoryID"));
        }
        return allCategoryId;
    }

    @Override
    public ArrayList<String> getAllCategoryIds() throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        String SQL = "Select CategoryID from category";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<String> allCategoryId = new ArrayList<>();
        while (rst.next()) {
            allCategoryId.add(rst.getString("CategoryID"));
        }
        return allCategoryId;
    }

    @Override
    public ArrayList<CategortDTO> viewCategoryDetails() throws Exception {
        ArrayList<CategortDTO> allCategory = new ArrayList<>();
        String SQL = "Select *from category";
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            allCategory.add(new CategortDTO(rst.getString(1), rst.getString(2)));
        }
        return allCategory;
    }

    @Override
    public boolean save(Category entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Category category) throws Exception {

        return CrudUtil.executeUpdate("Update category set CategoryName=? where CategoryID=? ", category.getCategoryName(), category.getCategoryID()) > 0;
    }

    @Override
    public Category search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Category> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategortDTO Search(String categoryID) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select *from category where CategoryID='" + categoryID + "'");
        if (rst.next()) {
            return new CategortDTO(rst.getString("CategoryID"), rst.getString("CategoryName"));
        }
        return null;
    }

    @Override
    public ArrayList<CategortDTO> getAlly() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(CategortDTO category) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategortDTO getCategoryName(String categaryId) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select *from category where CategoryID='" + categaryId + "'");
        if (rst.next()) {
            return new CategortDTO(rst.getString("CategoryID"), rst.getString("CategoryName"));
        }
        return null;
    }

    @Override
    public boolean addCaegory(Category category) throws Exception {
        return  CrudUtil.executeUpdate("Insert Into Category Values(?,?)",category.getCategoryID(),category.getCategoryName())>0;
    }

    @Override
    public boolean deleteCategory(String toString) throws Exception {
         Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        int rowa = stm.executeUpdate("Delete from Category where CategoryID='" + toString + "'");
        return rowa > 0;
    }

}
