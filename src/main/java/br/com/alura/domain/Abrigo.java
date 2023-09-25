package br.com.alura.domain;

public class Abrigo {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    public Abrigo(){}
    public Abrigo(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Abrigo setId(long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return """
                "id":%s,"nome":"%s","telefone":"%s","email":"%s"
                """.formatted(id,nome,telefone,email);
    }
}
