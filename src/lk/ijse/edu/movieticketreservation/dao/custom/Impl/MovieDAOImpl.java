/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.MovieDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.Movie;
import lk.ijse.edu.movieticketreservation.mdel.MovieDTO;

/**
 *
 *
 * @author sachin dilshan
 */
public class MovieDAOImpl implements MovieDAO {

    @Override
    public boolean updateMovie(MovieDTO movie) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteMovie(String movieID) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        int row = stm.executeUpdate("delete from move where MovieID='" + movieID + "'");
        return row > 0;
    }

    @Override
    public MovieDTO SerchMovie(String movieID) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        String SQL = "Select * From move where MovieID='" + movieID + "'";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new MovieDTO(rst.getString("MovieID"),
                    rst.getString("CategoryID"),
                    rst.getString("MovieName"),
                    rst.getString("Language"),
                    rst.getString("StartDate"),
                    rst.getString("EndDate"));
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<MovieDTO> getAllMovie() throws Exception {
        ArrayList<MovieDTO> allMovie = new ArrayList<>();
        String SQL = "Select *from Move";
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            allMovie.add(new MovieDTO(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));
        }
        return allMovie;
    }

    @Override
    public ArrayList<String> getAllMealName() throws Exception {
        Connection connection = DBConnection.getInstacne().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select MealID from meal");
        ArrayList<String> mealName = new ArrayList<>();
        while (rst.next()) {
            mealName.add(rst.getString("MealID"));
        }
        return mealName;
    }

    @Override
    public boolean addMovies(Movie movie) throws Exception {
        String SQL = "Insert into move Values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getInstacne().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, movie.getMoveId());
        stm.setObject(2, movie.getCategoryId());
        stm.setObject(3, movie.getMoveName());
        stm.setObject(4, movie.getLanguage());
        stm.setObject(5, movie.getStartDate());
        stm.setObject(6, movie.getEndDate());
        return stm.executeUpdate() > 0;
    }

    @Override
    public boolean update(Movie movie) throws Exception {
        return CrudUtil.executeUpdate("Update move set CategoryID=?,MovieName=?,Language=?,StartDate=?,EndDate=? where MovieID=? ", movie.getCategoryId(), movie.getMoveName(), movie.getLanguage(), movie.getStartDate(), movie.getEndDate(), movie.getMoveId())>0;

    }
}
