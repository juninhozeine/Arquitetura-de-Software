package DAO;


import Model.Cliente;
import java.util.HashSet;
import java.util.Set;

public class ClienteDaoImp implements ClienteDao{
    
    public Set<Cliente> clienteDB;
    
    public void create(Cliente c) throws Exception {
        if (clienteDB == null)
            clienteDB = new HashSet<>();
        
        if (clienteDB.add(c) == false)
            throw new Exception("Customer already exists");
    }
    
   public Set<Cliente> list() {
       return clienteDB;
   }

    @Override
    public void delete(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
