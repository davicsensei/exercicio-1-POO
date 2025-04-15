package com.uniube.main;

import com.uniube.financeiro.ContaBancaria;
import com.uniube.pessoa.Pessoa;
import com.uniube.veiculos.Carro;
import com.uniube.vendas.Pedido;
import com.uniube.vendas.Produto;

public class Main {
    public static void main(String[] args) {

        //TESTES CARRO
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


        // TESTES PESSOA
        Pessoa davi = new Pessoa();

        davi.setNome("Davi");
        davi.setIdade(15);
        davi.setCpf("12615457852");
        davi.setAltura(1.80);
        davi.setPeso(80);

        System.out.println(davi.calcularIMC());

        davi.fazerAniversario();




        //TESTES CONTA BANCARIA
        ContaBancaria contaDavics = new ContaBancaria("2",30000, "Davi");

        contaDavics.verificarSaldoDisponivel();
        contaDavics.aumentarLimite(30000);
        contaDavics.verificarSaldoDisponivel();
        System.out.println(contaDavics.getNumeroConta());
        contaDavics.sacar(2500);
        contaDavics.verificarSaldoDisponivel();
        contaDavics.depositar(50000);
        contaDavics.verificarSaldoDisponivel();


        //TESTES PRODUTO
        Produto arroz = new Produto("Canastra", 23.90,20, "Alimento",0);

        arroz.aplicarDesconto(50);
        System.out.println(arroz.getPreco());

        arroz.aumentarEstoque(35);
        System.out.println(arroz.getQuantidade());

        //TESTES PEDIDO
        Pedido pedido1 = new Pedido(1,"Davics", "15/01/2025", 1000, "Em andamento");

        pedido1.adicionarItem(300);
        pedido1.removerItem(100);
        pedido1.finalizarPedido();

        pedido1.exibirInfos();

    }
}