package DataBase;

import Connection.ConnectionFactory;
import DAO.PaisDAO;
import Data.Cliente;
import Data.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class PaisDaoImp{
    
    private PaisDAO paisDao;
    
     public void createPais(Pais pais){
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        
        try { 
            statement = connection.prepareStatement("INSERT INTO pais (nome_pais, sigla_pais, digitos_pais) VALUES (?,?,?)");
            statement.setString(1, pais.getNome());
            statement.setString(2, pais.getSigla());
            statement.setInt(3, pais.getDigitos());
            
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
            
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
   public void listPais() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

    
    public void deletePais(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
    public void updatePais(Pais p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
