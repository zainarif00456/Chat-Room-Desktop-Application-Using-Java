/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_application;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DEATHSTROKE
 */
public class DatabaseConnection {
    public static Connection con = null;
    public static Connection database()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connection = "jdbc:sqlserver://localhost:1433;databaseName=Phoenix;user=zainarif;password=123456789";
            con = DriverManager.getConnection(connection);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
        }
        return con;
    }
    
}
