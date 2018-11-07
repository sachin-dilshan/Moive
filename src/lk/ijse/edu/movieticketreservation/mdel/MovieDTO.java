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
public class MovieDTO {
    private String moveId;
    private String categoryId;
    private  String moveName;
    private String language;
    private String startDate;
    private String endDate;

    public MovieDTO() {
    }

    public MovieDTO(String moveId, String categoryId, String moveName, String language, String startDate, String endDate) {
        this.moveId = moveId;
        this.categoryId = categoryId;
        this.moveName = moveName;
        this.language = language;
        this.startDate = startDate;
        this.endDate = endDate;
    }

   
    /**
     * @return the moveId
     */
    public String getMoveId() {
        return moveId;
    }

    /**
     * @param moveId the moveId to set
     */
    public void setMoveId(String moveId) {
        this.moveId = moveId;
    }

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the moveName
     */
    public String getMoveName() {
        return moveName;
    }

    /**
     * @param moveName the moveName to set
     */
    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "MovieDTO{" + "moveId=" + moveId + ", categoryId=" + categoryId + ", moveName=" + moveName + ", language=" + language + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
    
}
