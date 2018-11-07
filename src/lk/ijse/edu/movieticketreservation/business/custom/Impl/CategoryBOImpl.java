
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.CategoryBO;
import lk.ijse.edu.movieticketreservation.dao.custom.CategoryDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.CategoryDAOImpl;
import lk.ijse.edu.movieticketreservation.entity.Category;
import lk.ijse.edu.movieticketreservation.entity.Shedule;
import lk.ijse.edu.movieticketreservation.mdel.CategortDTO;
import lk.ijse.edu.movieticketreservation.mdel.SheduleDTO;

/**
 *
 * @author sachin dilshan
 */
public class CategoryBOImpl implements CategoryBO {

    private static CategoryDAO categoryDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CATEGORY);

    public static boolean updateCatgory(CategortDTO categort) throws Exception {
        return categoryDAO.update(new Category(categort.getCategoryID(), categort.getCategoryName()));
    }

    public CategortDTO serchCategoryId(String categoryID) throws Exception {
        return categoryDAO.Search(categoryID);
    }

    public  ArrayList<String> getAllCategoryId() throws Exception {
        return categoryDAO.getAllCategoryId();
    }

    public  CategortDTO SerchCategory(String categoryId) throws Exception {
        return categoryDAO.Search(categoryId);
    }

    public  ArrayList<String> getAllCategortIds() throws Exception {
        return categoryDAO.getAllCategoryIds();
    }

    public  ArrayList<CategortDTO> getAllCategory() throws Exception {
        return null;
    }

    public  ArrayList<CategortDTO> viewCategoryDetails() throws Exception {
        return categoryDAO.viewCategoryDetails();
    }

    public  CategortDTO getCategoryName(String categaryId) throws Exception {
        return categoryDAO.getCategoryName(categaryId);
    }

    @Override
    public boolean addCaegory(CategortDTO categortDTO)throws Exception{
        return categoryDAO.addCaegory(new Category(categortDTO.getCategoryID(),categortDTO.getCategoryName()));
    }

    @Override
    public boolean deleteCategory(String toString) throws Exception {
        return categoryDAO.deleteCategory(toString);
    }

}
