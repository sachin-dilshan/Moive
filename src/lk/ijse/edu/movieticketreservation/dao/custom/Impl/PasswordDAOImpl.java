/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;


import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.PasswordDAO;
import lk.ijse.edu.movieticketreservation.entity.Passwords;


/**
 *
 * @author sachin dilshan
 */
public class PasswordDAOImpl implements PasswordDAO{

    @Override
    public boolean addNewPassword(Passwords passwords) throws Exception {
        return  CrudUtil.executeUpdate("Insert Into login Values(?,?)",passwords.getUserName(),passwords.getPassword())>0;
    }
    
}
