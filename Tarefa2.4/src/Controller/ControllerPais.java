package Controller;

import Model.Pais;
import java.util.HashSet;
import java.util.Set;

public class ControllerPais {
    
    private Set<Pais> paisDB;
    
    public void create(Pais p) throws Exception {
        if (paisDB == null)
            paisDB = new HashSet<>();
        
        if (paisDB.add(p) == false)
            throw new Exception("Country already exists");
    }
    
   public Set<Pais> list() {
       return paisDB;
   }
    
}
