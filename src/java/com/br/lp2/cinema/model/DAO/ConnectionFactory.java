
package com.br.lp2.cinema.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes
 */

public class ConnectionFactory {
    
    private final String driver = "org.apache.derby.jdbc.ClientDriver";
    private final String protocolo = "jdbc:derby:";
    private final String servidor = "//localhost:1527/";
    private final String dbName = "CINEMA";
    private Connection connection;

    public ConnectionFactory(){
        
    }
    
    public Connection getConnection(String tipo){
        
        if(tipo.equalsIgnoreCase("derby")){
            try {
                Class.forName(driver).newInstance();
                connection = DriverManager.getConnection(protocolo+servidor+dbName,"mack","mack");
            } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }
        
        return connection;
    }
}    
