/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class DatabaseConfig {
    
    private final static String url = "jdbc:mysql://localhost:3306/db_java_v1";
    private final static String userDb = "root";
    private final static String passDb = "";
    
    private static Connection connection; 
    
    private DatabaseConfig(){
        
    }
    
    public static Connection getConnection() throws SQLException{
        if(connection == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                connection = DriverManager.getConnection(url, userDb, passDb);
            }catch(ClassNotFoundException e){
                throw new SQLException("MySQL JBDC Driver not found", e);
            }
        }
        return connection;
    }
    
    public static void closeConnection(){
        try{
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
}
