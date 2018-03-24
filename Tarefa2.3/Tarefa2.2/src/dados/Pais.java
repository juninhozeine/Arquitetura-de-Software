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
public class Pais {
    private String nome;
    private String sigla;
    private int tamanhoNum;

    public Pais() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getTamanhoNum() {
        return tamanhoNum;
    }

    public void setTamanhoNum(int tamanhoNum) {
        this.tamanhoNum = tamanhoNum;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nome);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Country{" + "nome=" + nome + ", sigla=" + sigla + ", tamanhoNum=" + tamanhoNum + '}';
    }

    
}
