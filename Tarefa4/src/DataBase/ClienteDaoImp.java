package DataBase;


import Connection.ConnectionFactory;
import DAO.ClienteDAO;
import Data.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDaoImp{
    
    public ClienteDAO clienteDAO;
        
    public void create(Cliente cliente){
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        
        try { 
            statement = connection.prepareStatement("INSERT INTO cliente (nome_cliente, idade_cliente, limite_cliente, telefone_cliente) VALUES (?,?,?,?)");
            statement.setString(1, cliente.getNome());
            statement.setInt(2, cliente.getIdade());
            statement.setFloat(3, cliente.getLimiteCredito());
            statement.setString(4, cliente.getTelefone());
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
            
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
   public void list() {
       throw new UnsupportedOperationException("Not supported yet."); 
   }

    
    public void delete(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void update(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
