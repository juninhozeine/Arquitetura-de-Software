/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import dados.Pais;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jeff
 */
public class PaisBD {
    private Set<Pais> paisBanco;
    
    public void create(Pais p) throws Exception {
        if (paisBanco == null)
            paisBanco = new HashSet<>();
        
        if (paisBanco.add(p) == false)
            throw new Exception("País já existe!");
    }
   public Set<Pais> list() {
       return paisBanco;
   }
}
