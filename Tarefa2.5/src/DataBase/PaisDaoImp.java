package DataBase;

import DAO.PaisDao;
import Data.Pais;
import java.util.HashSet;
import java.util.Set;

public class PaisDaoImp implements PaisDao{
    
    private Set<Pais> paisDB;
    
    public void createPais(Pais p) throws Exception {
        if (paisDB == null)
            paisDB = new HashSet<>();
        
        if (paisDB.add(p) == false)
            throw new Exception("Country already exists");
    }
    
   public Set<Pais> listPais() {
       return paisDB;
   }

    @Override
    public void deletePais(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void updatePais(Pais p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
