
package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Drive";
    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "root";
    private static final String PASS = "utfpr";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }
    
    public static void closeConnection(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
            
        }catch(SQLException ex){
            throw new RuntimeException("Erro pra fechar conexão: ", ex);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement){
        
        closeConnection(connection);
        
        try{
            if(statement != null){
                statement.close();
            }
            
        }catch(SQLException ex){
            throw new RuntimeException("Erro pra fechar conexão: ", ex);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
        
        closeConnection(connection, statement);
        
        try{
            if(resultSet != null){
                resultSet.close();
            }
            
        }catch(SQLException ex){
            throw new RuntimeException("Erro pra fechar conexão: ", ex);
        }
    }
    
    
}
