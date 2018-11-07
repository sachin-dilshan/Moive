/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import lk.ijse.edu.movieticketreservation.entity.Passwords;

/**
 *
 * @author sachin dilshan
 */
public interface PasswordDAO {

    public boolean addNewPassword(Passwords passwords)throws Exception;
    
}
