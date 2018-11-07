/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.entity;

/**
 *
 * @author sachin dilshan
 */
public class Reservation {
    private String rID;
    private String peyID;
    private String custID;
    private int seatCount;
    private String movieID;
    private String rstDate;
    private String rstTime;

    public Reservation() {
    }

    public Reservation(String rID, String peyID, String custID, int seatCount, String movieID, String rstDate, String rstTime) {
        this.rID = rID;
        this.peyID = peyID;
        this.custID = custID;
        this.seatCount = seatCount;
        this.movieID = movieID;
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
     * @return the movieID
     */
    public String getMovieID() {
        return movieID;
    }

    /**
     * @param movieID the movieID to set
     */
    public void setMovieID(String movieID) {
        this.movieID = movieID;
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
        return "Reservation{" + "rID=" + rID + ", peyID=" + peyID + ", custID=" + custID + ", seatCount=" + seatCount + ", movieID=" + movieID + ", rstDate=" + rstDate + ", rstTime=" + rstTime + '}';
    }

    
}
