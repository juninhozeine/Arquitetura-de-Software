
package DAO;

import Model.Cliente;
import java.util.Set;



public interface ClienteDao {    
    public void create(Cliente c);
    
    public void delete(String nome);
    
    public Set<Cliente> list();   
    
    public void update(Cliente c);
}
