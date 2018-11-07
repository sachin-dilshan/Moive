/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.business.BOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.CategoryBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.CategoryBOImpl;
import lk.ijse.edu.movieticketreservation.dao.custom.CategoryDAO;
import lk.ijse.edu.movieticketreservation.entity.Category;
import lk.ijse.edu.movieticketreservation.mdel.CategortDTO;
import lk.ijse.edu.movieticketreservation.mdel.SheduleDTO;

/**
 *
 * @author sachin dilshan
 */
public class ManageCategoryController {
  private static CategoryBO categoryBO=new CategoryBOImpl();
    public static ArrayList<String> getAllCategortIds() throws Exception {
        return categoryBO.getAllCategortIds();
    }

    public static ArrayList<CategortDTO> viewCategoryDetails() throws Exception {
        return categoryBO.viewCategoryDetails();
    }

    public static CategortDTO SerchCategory(String categoryId) throws Exception {
        return categoryBO.SerchCategory(categoryId);
    }

    public static ArrayList<String> getAllCategoryId() throws Exception {
        return categoryBO.getAllCategoryId();
    }

    public static CategortDTO serchCategory(String categoryId) throws Exception {
        return categoryBO.SerchCategory(categoryId);

    }

    public static boolean updateCategory(CategortDTO categort) throws Exception {
        return CategoryBOImpl.updateCatgory(categort);
    }

    public static boolean addCaegory(CategortDTO categortDTO)throws Exception{
        return categoryBO.addCaegory(categortDTO);
    }

    public static boolean deleteCategory(String toString)throws Exception{
        return categoryBO.deleteCategory(toString);
    }

    public CategortDTO getCategoryName(String category) throws Exception {
        return categoryBO.getCategoryName(category);
    }
}
