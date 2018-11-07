/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.busines.custom;

import lk.ijse.edu.movieticketeservation.business.SupertBO;
import lk.ijse.edu.movieticketreservation.mdel.PasswordDTO;

/**
 *
 * @author sachin dilshan
 */
public interface PasswordBO extends SupertBO{

    public boolean addNewPassword(PasswordDTO password)throws Exception;
    
}
