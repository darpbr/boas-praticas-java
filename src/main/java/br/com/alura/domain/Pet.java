package br.com.alura.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pet {
    private Long id;
    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private Float peso;
    public Pet(){}
    public Pet(String tipo, String nome, String raca, int idade, String cor, Float peso){
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + nome.hashCode();
        result = 31 * result + tipo.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if(!(o instanceof Pet))
            return false;
        Pet other = (Pet) o;
        boolean idEquals = (this.id == null && other.id == null)
                || (this.id != null && this.id.equals(other.id));
        boolean nomeEquals = (this.nome == null && other.nome == null)
                || (this.nome != null && this.nome.equals(other.nome));
        return idEquals && nomeEquals;
    }
}
