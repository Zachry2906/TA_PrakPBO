/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApotekObject;
import Koneksi.Connector;
import java.sql.*;
import java.util.*;
import java.util.logging.Logger;
import Model.DataApotek;


import java.util.logging.Level;
import ApotekInterface.ApotekImplement;
/**
 *
 * @author aryaz
 */
public class DataAccess implements ApotekImplement{
    private Connection connection;
    private final String insert = "INSERT INTO dataobat (id, nama_obat, stock, harga, kadaluarsa) VALUES (?,?,?,?,?)";
    private final String update = "UPDATE dataobat SET id=?, nama_obat=?, stock=?, harga=?, kadaluarsa=? WHERE id=?";
    private final String delete = "DELETE FROM dataobat WHERE id=?";
    private final String select = "SELECT * FROM dataobat";
    private final String clear = "TRUNCATE dataobat";
    
    public DataAccess(){
        connection = Connector.getConnection();
    }
    
    @Override
    public void insert(DataApotek db) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, db.getId());
            statement.setString(2, db.getNama());
            statement.setDouble(3, db.getHarga());
            statement.setInt(4, db.getStock());
            statement.setString(5, db.getKadaluarsa());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void update(DataApotek db) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, db.getId());
            statement.setString(2, db.getNama());
            statement.setDouble(3, db.getHarga());
            statement.setInt(4, db.getStock());
            statement.setString(5, db.getKadaluarsa());
            statement.setString(6, db.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void delete(String id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger
                (DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}

    @Override
    public List<DataApotek> getAll() {
        List<DataApotek> list = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(select);
            while (rs.next()){
                DataApotek db = new DataApotek();
                db.setId(rs.getString("ID"));
                db.setNama(rs.getString("nama_obat"));
                db.setStock(rs.getInt("Stock"));
                db.setHarga(rs.getDouble("Harga"));
                db.setKadaluarsa(rs.getString("Kadaluarsa"));
                list.add(db);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void clear() {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(clear);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
