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
public class SeataTypeDTO {
    private String typeID;
    private double SeatPrice;
    private String satName;

    public SeataTypeDTO() {
    }

    public SeataTypeDTO(String typeID, double SeatPrice, String satName) {
        this.typeID = typeID;
        this.SeatPrice = SeatPrice;
        this.satName = satName;
    }

    /**
     * @return the typeID
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * @param typeID the typeID to set
     */
    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    /**
     * @return the SeatPrice
     */
    public double getSeatPrice() {
        return SeatPrice;
    }

    /**
     * @param SeatPrice the SeatPrice to set
     */
    public void setSeatPrice(double SeatPrice) {
        this.SeatPrice = SeatPrice;
    }

    /**
     * @return the satName
     */
    public String getSatName() {
        return satName;
    }

    /**
     * @param satName the satName to set
     */
    public void setSatName(String satName) {
        this.satName = satName;
    }

    @Override
    public String toString() {
        return "SeataTypeDTO{" + "typeID=" + typeID + ", SeatPrice=" + SeatPrice + ", satName=" + satName + '}';
    }
    
}
