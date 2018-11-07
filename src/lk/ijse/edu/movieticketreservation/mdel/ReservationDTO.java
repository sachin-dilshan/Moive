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
public class ReservationDTO {
     private String rID;
    private PaymentDTO paymentDTO;
    private CustomerDTO customerDTO;
    private int seatCount;
    private String movieID;
    private String rstDate;
    private String rstTime;

    public ReservationDTO() {
    }

    public ReservationDTO(String rID, PaymentDTO paymentDTO, CustomerDTO customerDTO, int seatCount, String movieID, String rstDate, String rstTime) {
        this.rID = rID;
        this.paymentDTO = paymentDTO;
        this.customerDTO = customerDTO;
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
     * @return the paymentDTO
     */
    public PaymentDTO getPaymentDTO() {
        return paymentDTO;
    }

    /**
     * @param paymentDTO the paymentDTO to set
     */
    public void setPaymentDTO(PaymentDTO paymentDTO) {
        this.paymentDTO = paymentDTO;
    }

    /**
     * @return the customerDTO
     */
    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    /**
     * @param customerDTO the customerDTO to set
     */
    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
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


}
