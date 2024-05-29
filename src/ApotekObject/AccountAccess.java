package ApotekObject;

import Koneksi.Connector;
import java.sql.*;
import java.util.*;
import java.util.logging.Logger;
import Model.DataAkun;
import projekakhir.ErrorView;
import projekakhir.MainView;

import java.util.logging.Level;
import ApotekInterface.AccountInterface;

public class AccountAccess {
    private Connection connection;
    private final String insert = "INSERT INTO dataakun (username, password) VALUES (?,?)";
    private final String select = "SELECT * FROM dataakun where username = ? and password = ?";
    
    public AccountAccess(){
        connection = Connector.getConnection();
    }
    
    public void insert(DataAkun db) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, db.getUsername());
            statement.setString(2, db.getPassword());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean verifyAccount(DataAkun db) {
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement(select);
            statement.setString(1, db.getUsername());
            statement.setString(2, db.getPassword());
            rs = statement.executeQuery();
            if (rs.next()) {
                new MainView().setVisible(true);
            } else {
                new ErrorView("Data login salah, ulangi lagi").setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

}

