/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.Objects;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private double limiteCredito;
    private String telefone;
    private Pais pais; 

    public Cliente() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        if(nome.length() >= 5)
            this.nome = nome;
        else
            throw new Exception("Nome precisa ter mais de 5 caracteres!");    
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if(this.idade <= 18)
            this.limiteCredito = 100;
        
        if(this.idade > 18 && idade <= 35)
            this.limiteCredito = 300;
        
        
        if(this.idade > 35)
            this.limiteCredito = 500;
        
        
        if(this.getPais().getSigla().equalsIgnoreCase("BR"))
            this.limiteCredito += 100;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) throws Exception {
        if(telefone.length() != this.getPais().getTamanhoNum()) 
            throw new Exception ("Digite um telefone válido para este País!");  
        else
            this.telefone = telefone;   
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + ", pais=" + pais + ", limiteCredito=" + limiteCredito + '}';
    }

    
}
