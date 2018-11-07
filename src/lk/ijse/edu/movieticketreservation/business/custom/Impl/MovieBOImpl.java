/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.business.custom.Impl;

import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.DAOFactory;
import lk.ijse.edu.movieticketreservation.busines.custom.MovieBO;
import lk.ijse.edu.movieticketreservation.dao.custom.MovieDAO;
import lk.ijse.edu.movieticketreservation.dao.custom.Impl.MovieDAOImpl;
import lk.ijse.edu.movieticketreservation.entity.Movie;
import lk.ijse.edu.movieticketreservation.mdel.MovieDTO;


/**
 *
 * @author sachin dilshan
 */
public class MovieBOImpl implements MovieBO{
    private static MovieDAO movieDAO= DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.MOVIE);

    public static ArrayList<MovieDTO> getAllMovie() throws Exception {
        return  movieDAO.getAllMovie();
    }

    public static boolean deleteMovie(String movieID) throws Exception {
        return  movieDAO.deleteMovie(movieID);
    }
   public static MovieDTO search(String id) throws Exception {
        return movieDAO.SerchMovie(id);

    }
    public static boolean addMovies(MovieDTO movie)throws Exception{
        return movieDAO.addMovies(new Movie(movie.getMoveId(),movie.getCategoryId(),movie.getMoveName(),movie.getLanguage(),movie.getStartDate(),movie.getEndDate()));
    }
//return mealDAO.update(new Meal(meals.getMealID(),meals.getMealName(),meals.getUnitPrice(),meals.getQty()));
    public static boolean updateMovie(MovieDTO movie)throws Exception{
        return movieDAO.update(new Movie(movie.getMoveId(),movie.getCategoryId(),movie.getMoveName(),movie.getLanguage(),movie.getStartDate(),movie.getEndDate()));
    }
}
