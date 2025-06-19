package com.example.telasrepresentante;

public class Produto {
    String nome;
    String descricao;
    double preco;
    int quantidade;

    public Produto(String nome, String descricao, double preco, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
