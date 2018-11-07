/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.controller;


import java.util.ArrayList;
import lk.ijse.edu.movieticketreservation.busines.custom.MovieBO;
import lk.ijse.edu.movieticketreservation.business.custom.Impl.MovieBOImpl;
import lk.ijse.edu.movieticketreservation.entity.Movie;
import lk.ijse.edu.movieticketreservation.mdel.MovieDTO;

/**
 *
 * @author sachin dilshan
 */
public class ManageMovieController {

    public static ArrayList<MovieDTO> getAllMovie()throws Exception{
        return MovieBOImpl.getAllMovie();
    }

    public static boolean deleteMovie(String toString)throws Exception{
        return  MovieBOImpl.deleteMovie(toString);    
    }

    public static MovieDTO search(String id) throws Exception {
        return  MovieBOImpl.search(id);
    }

    public static boolean addNewMovies(MovieDTO movie) throws Exception{
        return MovieBOImpl.addMovies(movie);
    }

    public static boolean updateMove(MovieDTO movie)throws Exception{
        return MovieBOImpl.updateMovie(movie);
    }

    public static boolean addMovie(MovieDTO movie) throws Exception {
         return  MovieBOImpl.addMovies(movie);
    }
    
}
