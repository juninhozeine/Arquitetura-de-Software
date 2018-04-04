
package DAO;

import Model.Pais;
import java.util.Set;



public interface PaisDao {    
    public void createPais(Pais p);
    
    public void deletePais(String nome);
    
    public Set<Pais> listPais();   
    
    public void updatePais(Pais p);
}
