
package com.br.lp2.cinema.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leticia
 */

public class ConnectionFactory {
    
    private final String driver = "com.apache.derby.jdbc.EmbeddedDriver";
    private final String protocolo = "jdbc:derby:";
    private final String dbName = "cinema_db";
    private Connection connection;

    public ConnectionFactory(){
        
    }
    
    public Connection getConnection(String tipo){
        
        if(tipo.equalsIgnoreCase("derby")){
            try {
                Class.forName(driver).newInstance();
                connection = DriverManager.getConnection(protocolo+dbName);
            } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }
        
        return connection;
    }
}    
