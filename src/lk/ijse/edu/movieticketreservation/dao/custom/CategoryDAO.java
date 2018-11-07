/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudDOA;
import lk.ijse.edu.movieticketeservation.dao.SuperDAO;
import lk.ijse.edu.movieticketreservation.entity.Category;
import lk.ijse.edu.movieticketreservation.entity.Shedule;
import lk.ijse.edu.movieticketreservation.mdel.CategortDTO;
import lk.ijse.edu.movieticketreservation.mdel.SheduleDTO;

/**
 *
 * @author sachin dilshan
 */
public interface CategoryDAO extends CrudDOA<Category, String> {

    public boolean delete(String categoryID) throws Exception;

    public CategortDTO Search(String categoryID) throws Exception;

    public ArrayList<CategortDTO> getAlly() throws Exception;

    public boolean add(CategortDTO category) throws Exception;

    public boolean update(Category category) throws Exception;

    public ArrayList<String> getAllCategoryId() throws Exception;

    public ArrayList<String> getAllCategoryIds() throws Exception;

    public ArrayList<CategortDTO> viewCategoryDetails() throws Exception;

    public CategortDTO getCategoryName(String categaryId) throws Exception;

    public boolean addCaegory(Category category)throws Exception;

    public boolean deleteCategory(String toString)throws Exception;

}
