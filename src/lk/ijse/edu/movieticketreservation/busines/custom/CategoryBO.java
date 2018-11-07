/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.busines.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.business.SupertBO;
import lk.ijse.edu.movieticketeservation.dao.CrudDOA;
import lk.ijse.edu.movieticketreservation.entity.Category;
import lk.ijse.edu.movieticketreservation.mdel.CategortDTO;

/**
 *
 * @author sachin dilshan
 */
//extends CrudDOA<Category, String>
public interface CategoryBO extends SupertBO {

    public CategortDTO serchCategoryId(String categoryID) throws Exception;

    public ArrayList<String> getAllCategoryId() throws Exception;

    public CategortDTO SerchCategory(String categoryId) throws Exception;

    public ArrayList<String> getAllCategortIds() throws Exception;

    public ArrayList<CategortDTO> getAllCategory() throws Exception;

    public ArrayList<CategortDTO> viewCategoryDetails() throws Exception;

    public CategortDTO getCategoryName(String categaryId) throws Exception;

    public boolean addCaegory(CategortDTO categortDTO) throws Exception;

    public boolean deleteCategory(String toString) throws Exception;

}
