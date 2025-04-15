package com.uniube.vendas;

public class Produto {
    private String nome ;
    private double preco ;
    private int quantidade ;
    private String categoria;
    private double desconto;

    public Produto(String nome, double preco, int quantidade, String categoria,double desconto){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.desconto = desconto;
    }

    public double calcularValorTotal(){
        return preco * quantidade;
    }

    public void aplicarDesconto(double porcentagem){
        this.desconto = preco * (porcentagem / 100);
        preco -= desconto;
    }

    public void aumentarEstoque(int quantidade){
        this.quantidade += quantidade;
    }



    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}

