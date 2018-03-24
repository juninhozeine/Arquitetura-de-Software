package Controller;


import Model.Cliente;
import java.util.HashSet;
import java.util.Set;

public class ControllerCliente {
    
    private Set<Cliente> clienteDB;
    
    public void create(Cliente c) throws Exception {
        if (clienteDB == null)
            clienteDB = new HashSet<>();
        
        if (clienteDB.add(c) == false)
            throw new Exception("Customer already exists");
    }
    
   public Set<Cliente> list() {
       return clienteDB;
   }
    
}
