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
public class Meal {

    public static void setMealId(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String mealID;
    private String mealName;
    private double unitPrice;
    private int qty;

    public Meal() {
    }

    public Meal(String mealID, String mealName, double unitPrice, int qty) {
        this.mealID = mealID;
        this.mealName = mealName;
        this.unitPrice = unitPrice;
        this.qty = qty;
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
     * @return the mealName
     */
    public String getMealName() {
        return mealName;
    }

    /**
     * @param mealName the mealName to set
     */
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Meal{" + "mealID=" + mealID + ", mealName=" + mealName + ", unitPrice=" + unitPrice + ", qty=" + qty + '}';
    }

     
}
