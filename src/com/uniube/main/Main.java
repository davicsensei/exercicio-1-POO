package com.uniube.main;

import com.uniube.pessoa.Pessoa;
import com.uniube.veiculos.Carro;

public class Main {
    public static void main(String[] args) {

        Carro ferrari = new Carro("ferrari","f90", 1998, 50,100);

        System.out.println("ano: " + ferrari.getAno() + "\nKM: " + ferrari.getKilometragem() + "\npreço: " +ferrari.getPreco());


        ferrari.acelerar(10);
        ferrari.acelerar(50);
        ferrari.acelerar(100);
        System.out.println("KM:" + ferrari.getKilometragem());

        ferrari.frear();
        System.out.println("KM:" + ferrari.getKilometragem());

        ferrari.atualizarPreco(900000);
        System.out.println("Preço: " + ferrari.getPreco());


        Pessoa davi = new Pessoa();

        davi.setNome("Davi");
        davi.setIdade(15);
        davi.setCpf("12615457852");
        davi.setAltura(1.80);
        davi.setPeso(80);

        System.out.println(davi.calcularIMC());

        davi.fazerAniversario();





    }
}