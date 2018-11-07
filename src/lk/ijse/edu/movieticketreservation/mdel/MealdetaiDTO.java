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
public class MealdetaiDTO {
    private String CustID;
    private String MealID;
    private int Qty;

    public MealdetaiDTO() {
    }

    public MealdetaiDTO(String CustID, String MealID, int Qty) {
        this.CustID = CustID;
        this.MealID = MealID;
        this.Qty = Qty;
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the MealID
     */
    public String getMealID() {
        return MealID;
    }

    /**
     * @param MealID the MealID to set
     */
    public void setMealID(String MealID) {
        this.MealID = MealID;
    }

    /**
     * @return the Qty
     */
    public int getQty() {
        return Qty;
    }

    /**
     * @param Qty the Qty to set
     */
    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    @Override
    public String toString() {
        return "MealdetaiDTO{" + "CustID=" + CustID + ", MealID=" + MealID + ", Qty=" + Qty + '}';
    }

   
    
}
