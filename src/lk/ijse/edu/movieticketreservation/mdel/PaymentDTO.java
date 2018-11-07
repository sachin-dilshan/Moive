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
public class PaymentDTO {
    private String petID;
    private double amount;

    public PaymentDTO() {
    }

    public PaymentDTO(String petID, double amount) {
        this.petID = petID;
        this.amount = amount;
    }
    /**
     * @return the petID
     */
    public String getPetID() {
        return petID;
    }

    /**
     * @param petID the petID to set
     */
    public void setPetID(String petID) {
        this.petID = petID;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" + "petID=" + petID + ", amount=" + amount + '}';
    }
    
}
