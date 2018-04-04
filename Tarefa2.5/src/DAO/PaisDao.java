
package DAO;

import Data.Pais;
import java.util.Set;



public interface PaisDao {    
    public void createPais(Pais p)throws Exception;
    
    public void deletePais(String nome);
    
    public Set<Pais> listPais();   
    
    public void updatePais(Pais p);
}
