/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;

import lk.ijse.edu.movieticketreservation.busines.custom.PasswordBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.PasswordBOImpl;

import lk.ijse.edu.movieticketreservation.mdel.PasswordDTO;

/**
 *
 * @author sachin dilshan
 */
public class ManagePasswordController {

    private static PasswordBO passwordBO = new PasswordBOImpl();

    public static boolean addNewPassword(PasswordDTO password) throws Exception {
        return passwordBO.addNewPassword(password);
    }

}
