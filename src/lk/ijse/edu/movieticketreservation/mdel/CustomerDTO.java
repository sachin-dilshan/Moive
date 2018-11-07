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
public class CustomerDTO {
    private String custId;
    private String custName;
    private  String contactNo;
    private String date;
    private String time;

    public CustomerDTO() {
    }

    public CustomerDTO(String custId, String custName, String contactNo, String date, String time) {
        this.custId = custId;
        this.custName = custName;
        this.contactNo = contactNo;
        this.date = date;
        this.time = time;
    }
   

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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
        return "CustomerDTO{" + "custId=" + custId + ", custName=" + custName + ", contactNo=" + contactNo + ", date=" + date + ", time=" + time + '}';
    }
    
}
