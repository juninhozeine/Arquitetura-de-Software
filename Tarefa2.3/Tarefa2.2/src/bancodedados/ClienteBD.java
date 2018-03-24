/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import dados.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jeff
 */
public class ClienteBD {
    private Set<Cliente> clienteBanco;
    
    public void create(Cliente c) throws Exception {
        if (clienteBanco == null)
            clienteBanco = new HashSet<>();
        
        if (clienteBanco.add(c) == false)
            throw new Exception("Cliente já existe!");
    }
    
    public Set<Cliente> list() {
       return clienteBanco;
    }
}
