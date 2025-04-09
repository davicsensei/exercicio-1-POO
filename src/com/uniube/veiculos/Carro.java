package com.uniube.veiculos;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int kilometragem;
    private double preco;

    public void acelerar(int km){
        kilometragem = kilometragem + km;
        System.out.println("Acelerando carro... KM atrual: "+ kilometragem);
    }

    public void frear(){
        System.out.println("Carro parando");
        kilometragem = 0;
    }

    public void atualizarPreco(double novoPreco){
        preco = novoPreco;
    }

    public Carro(String marca, String modelo, int ano, int kilometragem, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
        this.preco = preco;
    }


    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
