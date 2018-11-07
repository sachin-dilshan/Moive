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
public class SeatDTO {
    private String rID;
    private String peyID;
    private String custID;
    private String mealID;
    private int seatCount;
    private String movieName;
    private String rstDate;
    private String rstTime;

    public SeatDTO() {
    }

    public SeatDTO(String rID, String peyID, String custID, String mealID, int seatCount, String movieName, String rstDate, String rstTime) {
        this.rID = rID;
        this.peyID = peyID;
        this.custID = custID;
        this.mealID = mealID;
        this.seatCount = seatCount;
        this.movieName = movieName;
        this.rstDate = rstDate;
        this.rstTime = rstTime;
    }

    /**
     * @return the rID
     */
    public String getrID() {
        return rID;
    }

    /**
     * @param rID the rID to set
     */
    public void setrID(String rID) {
        this.rID = rID;
    }

    /**
     * @return the peyID
     */
    public String getPeyID() {
        return peyID;
    }

    /**
     * @param peyID the peyID to set
     */
    public void setPeyID(String peyID) {
        this.peyID = peyID;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the mealID
     */
    public String getMealID() {
        return mealID;
    }

    /**
     * @param mealID the mealID to set
     */
    public void setMealID(String mealID) {
        this.mealID = mealID;
    }

    /**
     * @return the seatCount
     */
    public int getSeatCount() {
        return seatCount;
    }

    /**
     * @param seatCount the seatCount to set
     */
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    /**
     * @return the movieName
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * @param movieName the movieName to set
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    /**
     * @return the rstDate
     */
    public String getRstDate() {
        return rstDate;
    }

    /**
     * @param rstDate the rstDate to set
     */
    public void setRstDate(String rstDate) {
        this.rstDate = rstDate;
    }

    /**
     * @return the rstTime
     */
    public String getRstTime() {
        return rstTime;
    }

    /**
     * @param rstTime the rstTime to set
     */
    public void setRstTime(String rstTime) {
        this.rstTime = rstTime;
    }

    @Override
    public String toString() {
        return "SeatDTO{" + "rID=" + rID + ", peyID=" + peyID + ", custID=" + custID + ", mealID=" + mealID + ", seatCount=" + seatCount + ", movieName=" + movieName + ", rstDate=" + rstDate + ", rstTime=" + rstTime + '}';
    }
    
}
