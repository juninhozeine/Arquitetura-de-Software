/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;

/**
 *
 * @author Aluno
 */
public interface ClienteDao {
    public void save(Cliente nome);
    
    public void delete(String nome);
    
    public Cliente find(String Nome);
   
}
