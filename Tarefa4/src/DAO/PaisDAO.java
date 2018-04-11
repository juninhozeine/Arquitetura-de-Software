/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Data.Pais;
import DataBase.PaisDaoImp;

/**
 *
 * @author Juninho
 */
public class PaisDAO {
    private PaisDaoImp paisDaoImp;
    
    public PaisDAO(){
        paisDaoImp = new PaisDaoImp();
    }
    
    public void createPais(Pais pais){
        paisDaoImp.createPais(pais);
    }
    public void list(){
        
    }
    
    public void delete(Pais pais, int id){
        paisDaoImp.deletePais(id);
    }
    public void update(Pais pais) {
        paisDaoImp.updatePais(pais);
    }
}
