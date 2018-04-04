package Data;

import java.util.Objects;

public class Cliente {
    
    private String nome;
    private int idade;
    private String telefone;
    private Pais pais;
    private double limiteCredito;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() >= 5)
            this.nome = nome;
        
        else
            throw new Exception("Nome deve ter 5 caracteres ou mais");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {
        if (telefone.length() != this.getPais().getDigitos())
            throw new Exception ("Número de telefone inválido");
            
        else
            this.telefone = telefone;
    }

    public Pais getPais() {
        return pais;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        
        if (this.getIdade() > 35)
            this.limiteCredito = 500;
        
        else if (this.getIdade() > 18)
            this.limiteCredito = 300;
        
        else
            this.limiteCredito = 100;
        
        
        if (this.getPais().getSigla().equalsIgnoreCase("BR"))
            this.limiteCredito += 100;
    }
    


    public void setPais(Pais pais) throws Exception {
        
        if (pais == null)
            throw new Exception ("Pais deve ser informado");
        
        else
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
