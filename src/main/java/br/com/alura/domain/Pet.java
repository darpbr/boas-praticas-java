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
}
