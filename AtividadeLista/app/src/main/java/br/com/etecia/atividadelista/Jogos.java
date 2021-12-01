package br.com.etecia.atividadelista;

public class Jogos {

    private String nomeJogo;
    private String nome;
    private int idade;

    public Jogos() {
    }

    public Jogos(String nomeJogo, String nome, int idade) {
        this.nomeJogo = nomeJogo;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

