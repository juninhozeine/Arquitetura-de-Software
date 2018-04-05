
package DAO;

import Data.Cliente;
import java.util.Set;



public interface ClienteDao {    
    public void create(Cliente c) throws Exception;
    
    public void delete(String nome);
    
    public Set<Cliente> list();   
    
    public void update(Cliente c);
}
