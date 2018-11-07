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
public class Shedule {
    private String sheduleID;
    private  String movieID;
    private String time;

    public Shedule() {
    }

    public Shedule(String sheduleID, String movieID, String time) {
        this.sheduleID = sheduleID;
        this.movieID = movieID;
        this.time = time;
    }

    /**
     * @return the sheduleID
     */
    public String getSheduleID() {
        return sheduleID;
    }

    /**
     * @param sheduleID the sheduleID to set
     */
    public void setSheduleID(String sheduleID) {
        this.sheduleID = sheduleID;
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
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Shedule{" + "sheduleID=" + sheduleID + ", movieID=" + movieID + ", time=" + time + '}';
    }
    
}
