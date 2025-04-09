package com.uniube.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcularIMC(){
        return peso / (Math.pow(altura, 2));
    }

    public void fazerAniversario(){
        idade ++;
        System.out.println(nome + " está fazendo aniversário!! Agora " + nome + " tem " + idade + " Anos!!" );
    }
}
