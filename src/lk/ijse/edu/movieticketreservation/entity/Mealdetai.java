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
public class Mealdetai {
    private String MealID;
    private String CustID;
    private int Qty;

    public Mealdetai() {
    }

    public Mealdetai(String MealID, String CustID, int Qty) {
        this.MealID = MealID;
        this.CustID = CustID;
        this.Qty = Qty;
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
        return "Mealdetai{" + "MealID=" + MealID + ", CustID=" + CustID + ", Qty=" + Qty + '}';
    }

    
    
}
