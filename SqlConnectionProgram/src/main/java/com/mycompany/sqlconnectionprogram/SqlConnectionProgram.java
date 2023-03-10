package com.mycompany.sqlconnectionprogram;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlConnectionProgram {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //DESKTOP-EEPBQU7 is my system name and SQLEXPRESS is my instance name
            String dbUrl = "jdbc:sqlserver://DESKTOP-EEPBQU7\\SQLEXPRESS;databasename=STUDENT;integratedSecurity=true";
            try {
                Connection connection = DriverManager.getConnection(dbUrl);
                System.out.println("Successfully connected Java to Sql server.");
            } catch (SQLException ex) {
                Logger.getLogger(SqlConnectionProgram.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Hello World!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SqlConnectionProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
