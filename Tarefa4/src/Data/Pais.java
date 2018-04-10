package Data;

import java.util.Objects;

public class Pais {

    private int id;
    private String nome;
    private String sigla;
    private int digitos;

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

    public int getDigitos() {
        return digitos;
    }

    public void setDigitos(int digitos) {
        this.digitos = digitos;
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
        return "Pais{" + "nome=" + nome + ", sigla=" + sigla + ", digitos=" + digitos + '}';
    }

}
