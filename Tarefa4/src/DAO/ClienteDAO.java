/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Data.Cliente;
import DataBase.ClienteDaoImp;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juninho
 */
public class ClienteDAO {
    
    private ClienteDaoImp clienteDaoImp;
            
     public ClienteDAO(){
         clienteDaoImp = new ClienteDaoImp();
     }
     
    public void create(Cliente cliente){
        clienteDaoImp.create(cliente);
    }
    
    public void list(Cliente cliente){
        clienteDaoImp.List(cliente);
    }
    
    public void delete(Cliente cliente, int id){
        clienteDaoImp.delete(id);
    }
    public void update(Cliente cliente) {
        clienteDaoImp.update(cliente);
    }
    
}
