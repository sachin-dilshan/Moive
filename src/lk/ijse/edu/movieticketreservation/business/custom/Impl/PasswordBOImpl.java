/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.PasswordBO;
import lk.ijse.edu.movieticketreservation.dao.custom.PasswordDAO;
import lk.ijse.edu.movieticketreservation.entity.Passwords;
import lk.ijse.edu.movieticketreservation.mdel.PasswordDTO;

/**
 *
 * @author sachin dilshan
 */
public class PasswordBOImpl implements PasswordBO {

    private static PasswordDAO passwordDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PASSWORD);

//    @Override
//    public boolean addNewPassword(PasswordDTO password) throws Exception {
//        return passwordDAO.addNewPassword(new Passwords(password.getUserName(), password.getPassword()));
//
//    }

    @Override
    public boolean addNewPassword(PasswordDTO password) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
