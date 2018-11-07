/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketeservation.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.text.html.HTML;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;

/**
 *
 * @author sachin dilshan
 */
public class CrudUtil {

    private static PreparedStatement getPreparedStatement(String sql, Object... params) throws Exception {
        
        int paramsCount = sql.split("[?]").length - 1;
        if (paramsCount != params.length){
            throw new RuntimeException("Parameters count is mismatched");
        }
        
        Connection connection=DBConnection.getInstacne().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);

        for (int i = 0; i < params.length; i++) {
            pstm.setObject(i + 1, params[i]);
        }

        return pstm;
    }

    public static ResultSet executeQuery(String sql, Object... params) throws Exception {
        return getPreparedStatement(sql, params).executeQuery();
    }

    public static int executeUpdate(String sql, Object... params) throws Exception {
        return getPreparedStatement(sql, params).executeUpdate();
    }

   
            
    
}
