package br.com.etecia.atividadelista;

public class Jogos {
    //Criando as variáveis globais
    private String nomeJogo;
    private String nome;
    private int idade;

    //Criando o método contrutor sem parâmetros com ALT + INSERT

    public Jogos() {
    }

    //Criando o método contrutor com parâmetros com ALT + INSERT

    public Jogos(String nomeJogo, String nome, int idade) {
        this.nomeJogo = nomeJogo;
        this.nome = nome;
        this.idade = idade;
    }

    //Criando os métodos GET e SET com ALT + INSERT

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

