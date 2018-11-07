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
public class Seat {
   private String seatID;
   private String isBook;

    public Seat() {
    }

    public Seat(String seatID, String isBook) {
        this.seatID = seatID;
        this.isBook = isBook;
    }

    /**
     * @return the seatID
     */
    public String getSeatID() {
        return seatID;
    }

    /**
     * @param seatID the seatID to set
     */
    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    /**
     * @return the isBook
     */
    public String getIsBook() {
        return isBook;
    }

    /**
     * @param isBook the isBook to set
     */
    public void setIsBook(String isBook) {
        this.isBook = isBook;
    }

    @Override
    public String toString() {
        return "Seat{" + "seatID=" + seatID + ", isBook=" + isBook + '}';
    }
   
}
