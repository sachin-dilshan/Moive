/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.SuperDAO;
import lk.ijse.edu.movieticketreservation.entity.Movie;
import lk.ijse.edu.movieticketreservation.mdel.MovieDTO;

/**
 *
 * @author sachin dilshan
 */
public interface MovieDAO {

    public boolean updateMovie(MovieDTO movie) throws Exception;

    public boolean deleteMovie(String movieID) throws Exception;

    public MovieDTO SerchMovie(String movieID) throws Exception;

    public ArrayList<MovieDTO> getAllMovie() throws Exception;

    public ArrayList<String> getAllMealName() throws Exception;

    public boolean addMovies(Movie movie) throws Exception;

    public boolean update(Movie movie)throws Exception;
}
