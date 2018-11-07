/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketeservation.dao;

import java.util.ArrayList;
import lk.ijse.edu.movieticketreservation.entity.Category;
import lk.ijse.edu.movieticketreservation.mdel.CategortDTO;

/**
 *
 * @author sachin dilshan
 */
public interface CrudDOA <T, ID> extends SuperDAO{


    public boolean save(T entity) throws Exception;

    public boolean update(T shedule) throws Exception;

    public boolean delete(ID id) throws Exception;

    public T search(ID id) throws Exception;

    public ArrayList<T> getAll() throws Exception;   

}
