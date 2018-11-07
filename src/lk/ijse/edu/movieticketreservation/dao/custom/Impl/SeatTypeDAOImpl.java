/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.movieticketreservation.dao.custom.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.edu.movieticketeservation.dao.CrudUtil;
import lk.ijse.edu.movieticketreservation.dao.custom.SeatTypeDAO;
import lk.ijse.edu.movieticketreservation.dbConnection.DBConnection;
import lk.ijse.edu.movieticketreservation.entity.SeataType;
import lk.ijse.edu.movieticketreservation.mdel.SeataTypeDTO;

/**
 *
 * @author sachin dilshan
 */
public class SeatTypeDAOImpl implements SeatTypeDAO {

    @Override
    public ArrayList<String> getAllSeatType() throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select TypeID from seattype");
        ArrayList<String> seatType = new ArrayList<>();
        while (rst.next()) {
            seatType.add(rst.getString("TypeID"));
        }
        return seatType;
    }

    @Override
    public ArrayList<SeataTypeDTO> viewSeatTypeDetatis() throws Exception {
        ArrayList<SeataTypeDTO> alSeatTypeDetails = new ArrayList<>();
        String SQL = "select *from seattype";
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            alSeatTypeDetails.add(new SeataTypeDTO(rst.getString(1), rst.getDouble(2), rst.getString(3)));
        }
        return alSeatTypeDetails;
    }

    @Override
    public boolean deleteSeatType(String TypeID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SeataTypeDTO SerchSeatType(String TypeID) throws Exception {
        Connection conn = DBConnection.getInstacne().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("select *from seattype where TypeID='" + TypeID + "'");
        if (rst.next()) {
            return new SeataTypeDTO(rst.getString("TypeID"), rst.getDouble("SeatPrice"), rst.getString("SatName"));
        }
        return null;
    }

    @Override
    public boolean addSeatType(SeataTypeDTO seataType) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SeataType seataType) throws Exception {
        return CrudUtil.executeUpdate("Update seattype set SeatPrice=?,SatName=? where TypeID=? ", seataType.getSeatPrice(), seataType.getSatName(), seataType.getTypeID()) > 0;
    }

    @Override
    public boolean save(SeataType entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SeataType search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SeataType> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSeatPrice(String seatTypeID) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select SeatPrice from seattype where typeID=? ", seatTypeID);
        if(rst.next()){
            return rst.getDouble(1)+"";
        }else{
           return null;
        }
    }

    @Override
    public String getSeatPriceBB(String seatTypeID) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select SeatPrice from seattype where typeID=? ", seatTypeID);
        if(rst.next()){
            return rst.getDouble(1)+"";
        }else{
           return null;
        }   
    }

    @Override
    public String getSeatPriceB(String seatTypeID) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select SeatPrice from seattype where typeID=? ", seatTypeID);
        if(rst.next()){
            return rst.getDouble(1)+"";
        }else{
           return null;
        }   
    }

    @Override
    public String getSeatPriceODC(String seatTypeID) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select SeatPrice from seattype where typeID=? ", seatTypeID);
        if(rst.next()){
            return rst.getDouble(1)+"";
        }else{
           return null;
        }   
    }
}
 