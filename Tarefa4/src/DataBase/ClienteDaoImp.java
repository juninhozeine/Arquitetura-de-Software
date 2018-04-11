package DataBase;


import Connection.ConnectionFactory;
import DAO.ClienteDAO;
import Data.Cliente;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public void delete(int id){
 
        String sql = "DELETE FROM cliente WHERE id = ?";
 
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
 
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
 
            statement.execute();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
 
        try{
            if(statement != null){
 
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   
    public void update(Cliente cliente){
        String sql = "UPDATE cliente SET nome_cliente = ?, idade_cliente = ?, limite_cliente = ?, telefone_cliente = ?" + " WHERE id = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
 
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setInt(2, cliente.getIdade());
            statement.setFloat(3, cliente.getLimiteCredito());
            statement.setString(4, cliente.getTelefone());
 
            statement.execute();
 
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
 
        try{
            if(statement != null){
                statement.close();
            }
 
            if(connection != null){
                connection.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   
    public List<Cliente> getClientes(){
       
        String sql = "SELECT * FROM cliente";
        List<Cliente> clientes = new ArrayList<Cliente>();
       
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
      
        ResultSet rset = null;
 
        try {
            statement = connection.prepareStatement(sql);
            rset = statement.executeQuery();
           
            while(rset.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rset.getInt("id_cliente"));
                cliente.setNome(rset.getString("nome_cliente"));
                cliente.setIdade(rset.getInt("idade_cliente"));
                cliente.setTelefone(rset.getString("telefone_cliente"));
                cliente.setLimiteCredito(rset.getInt("limite_cliente"));

                clientes.add(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        try{
 
            if(rset != null){
                rset.close();
            }

            if(statement != null){
                statement.close();
            }
 
            if(connection != null){
                connection.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        return clientes;
    }  
}
