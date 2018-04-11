package DataBase;

import Connection.ConnectionFactory;
import DAO.PaisDAO;
import Data.Cliente;
import Data.Pais;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public void deletePais(int id){
 
        String sql = "DELETE FROM pais WHERE id = ?";
 
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
 
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
 
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
        
    public void updatePais(Pais pais){
            
        String sql = "UPDATE pais SET nome_pais = ?, sigla_pais = ?, digitos_pais = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
 
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, pais.getNome());
            statement.setString(2, pais.getSigla());
            statement.setInt(3, pais.getDigitos());
   
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
    }
    public List<Pais> getPaises(){
       
        String sql = "SELECT * FROM pais";
        List<Pais> paises = new ArrayList<Pais>();
       
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
      
        ResultSet rset = null;
 
        try {
            statement = connection.prepareStatement(sql);
            rset = statement.executeQuery();
           
            while(rset.next()){
                Pais pais = new Pais();
                pais.setId(rset.getInt("id_pais"));
                pais.setNome(rset.getString("nome_pais"));
                pais.setSigla(rset.getString("sigla_pais"));
                
                paises.add(pais);
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
        return paises;
    }  
}
