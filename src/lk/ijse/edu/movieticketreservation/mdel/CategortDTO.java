/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.mdel;

/**
 *
 * @author sachin dilshan
 */
public class CategortDTO {
     private String CategoryID;
     private String CategoryName;

    public CategortDTO() {
    }

    public CategortDTO(String CategoryID, String CategoryName) {
        this.CategoryID = CategoryID;
        this.CategoryName = CategoryName;
    }

    /**
     * @return the CategoryID
     */
    public String getCategoryID() {
        return CategoryID;
    }

    /**
     * @param CategoryID the CategoryID to set
     */
    public void setCategoryID(String CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * @return the CategoryName
     */
    public String getCategoryName() {
        return CategoryName;
    }

    /**
     * @param CategoryName the CategoryName to set
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    @Override
    public String toString() {
        return "CategortDTO{" + "CategoryID=" + CategoryID + ", CategoryName=" + CategoryName + '}';
    }
    
     
             
}
